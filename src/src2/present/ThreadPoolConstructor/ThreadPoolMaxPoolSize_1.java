package present.ThreadPoolConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolMaxPoolSize_1 {
    public static void main(String[] args) {
        int sizeQueue = 100;

        ExecutorService executorService = new ThreadPoolExecutor(
                3,
                20,
                1,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(sizeQueue)
        );

        // 1. Запускаем 20 задач при размере очереди 100
        // 2. Изменим размер очереди на 10
        for (int i = 1; i <= 20; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Выполнение задачи " + taskId + " в потоке " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
                System.out.println("Задача " + taskId + " выполнена");
            });
        }

        executorService.shutdown();

    }
}
