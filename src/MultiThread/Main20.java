package MultiThread;

import dto.IFigura;
import dto.Rectangular;
import dto.Square;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class Main20 {
    public static void main(String[] args) {
        BlockingQueue<IFigura> queue = new LinkedBlockingQueue<>();

        ExecutorService producer = Executors.newFixedThreadPool(2);


        producer.submit(new FigureProducerJob(queue, () ->
        {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            return new Square(random.nextInt(10, 100),
                    String.valueOf(random.nextInt()));
        }));

        producer.submit(new FigureProducerJob(queue, () ->
        {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            return new Rectangular(
                    String.valueOf(random.nextInt()),
                    random.nextInt(10, 100),
                    random.nextInt(10, 100)
            );
        }));

        producer.submit(new TriangleProducerJob(queue));
        producer.submit(new SquqreProducerJob(queue));

        ExecutorService consumer = Executors.newFixedThreadPool(1);

        consumer.submit(new ConsumerJob(queue));
    }
}
