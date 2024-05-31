package present.ThreadPoolConstructor;

import java.util.concurrent.*;

public class ThreadPoolAbortPolicy_2 {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(
                1,
                1,
                1,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                new ThreadPoolExecutor.AbortPolicy()
        );
        //AbortPolicy (стратегия отказа по умолчанию):Если все потоки в пуле заняты, а очередь задач заполнена,
        // новые задачи будут отклонены с исключением RejectedExecutionException.

        // Запускаем 5 задач
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Выполнение задачи " + taskId);
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
