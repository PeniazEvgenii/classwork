package MultiThread;

import dto.IFigura;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public abstract class AProducerJob implements Runnable{
    private Queue<IFigura> queue;

    public AProducerJob(Queue<IFigura> queue) {
        this.queue = queue;
    }

    @Override
    public final void run() {
        while (true) {
            queue.add(get());

            try {
                TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(100,1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public abstract IFigura get();
}
