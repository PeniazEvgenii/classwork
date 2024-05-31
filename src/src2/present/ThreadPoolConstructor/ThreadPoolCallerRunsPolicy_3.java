package present.ThreadPoolConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolCallerRunsPolicy_3 {
    public static void main(String[] args) {
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(
                1,
                1,
                1,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
// CallerRunsPolicy: Если все потоки в пуле заняты, а очередь задач заполнена, новая задача будет выполнена вызывающим потоком,
// который пытается добавить эту задачу. Это может быть полезно, если вы хотите снизить скорость добавления новых задач и предотвратить исключение RejectedExecutionException.

        // Запускаем 5 задач
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Выполнение задачи " + taskId + " потоком " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
                System.out.println("Задача " + taskId + " выполнена");
            });
        }

        executorService.shutdownNow();

    }
}
