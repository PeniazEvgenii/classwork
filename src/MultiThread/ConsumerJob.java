package MultiThread;

import dto.IFigura;

import java.util.Queue;
import java.util.concurrent.Callable;

public class ConsumerJob implements Callable<Long> {
    private final Queue<IFigura> queue;

    public ConsumerJob(Queue<IFigura> queue) {
        this.queue = queue;
    }

    @Override
    public Long call() throws Exception {
        long result = 0;
        while (true) {

            IFigura figura = queue.poll();
            if(figura != null){
                System.out.println("Получил " + figura);
                result++;
            }

        }
    //    return result;
    }
}
