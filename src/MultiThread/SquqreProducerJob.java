package MultiThread;

import dto.IFigura;
import dto.Rectangular;
import dto.Square;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class SquqreProducerJob extends AProducerJob{

    public SquqreProducerJob(Queue<IFigura> queue) {
        super(queue);
    }

    @Override
    public IFigura get() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new Square(
                random.nextInt(),
                String.valueOf(random.nextInt())
        );
    }
}
