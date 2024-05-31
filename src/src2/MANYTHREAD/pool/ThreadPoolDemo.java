package MANYTHREAD.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
       // Executors.newSingleThreadExecutor();
       // Executors.newCachedThreadPool();
       // Executors.newScheduledThreadPool(3);
       // Executors.newWorkStealingPool();

        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("it's collable");
            return 1;
        });

        System.out.println("result " + future.get(10,TimeUnit.SECONDS));

        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.HOURS);
        System.out.println("Main end");

    }
}
