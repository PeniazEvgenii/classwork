package MultiThread;

import dto.IFigura;
import dto.Rectangular;
import dto.Triangle;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class TriangleProducerJob extends AProducerJob{

    public TriangleProducerJob(Queue<IFigura> queue) {
        super(queue);
    }

    @Override
    public IFigura get() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new Rectangular(
                String.valueOf(random.nextInt()),
                random.nextInt(),
                random.nextInt()
        );
    }
}
