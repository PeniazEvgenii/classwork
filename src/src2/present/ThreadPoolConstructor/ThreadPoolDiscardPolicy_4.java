package present.ThreadPoolConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDiscardPolicy_4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,
                1,
                1,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                new ThreadPoolExecutor.DiscardPolicy()
        );
//  DiscardPolicy: Если все потоки в пуле заняты, а очередь задач заполнена,
//  новые задачи будут просто отброшены без какого-либо уведомления или выполнения.

        // Запускаем 5 задач
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Выполнение задачи " + taskId + " потоком " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
                System.out.println("Задача " + taskId + " выполнена");
            });
        }

        executor.shutdown();

    }
}
