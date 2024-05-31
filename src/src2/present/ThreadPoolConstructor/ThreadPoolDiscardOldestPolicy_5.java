package present.ThreadPoolConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDiscardOldestPolicy_5 {
    public static void main(String[] args) {
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(
                1,
                1,
                1,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );
//   Если все потоки в пуле заняты, а очередь задач заполнена, самая старая задача из очереди будет удалена,
//   чтобы освободить место для новой задачи. Затем новая задача будет добавлена в очередь для выполнения.

        // Запускаем 5 задач
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.execute(() -> {
                System.out.println("Выполнение задачи " + taskId + " потоком " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
                System.out.println("Задача " + taskId + " выполнена");
            });
        }

        executorService.shutdown();

    }
}
