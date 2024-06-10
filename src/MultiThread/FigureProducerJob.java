package MultiThread;

import dto.IFigura;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class FigureProducerJob implements Runnable{
    private final Queue<IFigura> queue;
    private final Supplier<IFigura> supplier;

    public FigureProducerJob(Queue<IFigura> queue, Supplier<IFigura> supplier) {
        this.queue = queue;
        this.supplier = supplier;
    }

    @Override
    public final void run() {
        while (true) {
            queue.add(supplier.get());

            try {
                TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(100,1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
