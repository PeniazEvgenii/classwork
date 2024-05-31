package present.ExecutorServiceMethods;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample_6 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // добавляем в очередь на выполнение 10 тыс. заданий
        for (int i = 0; i < 10_000; i++) {
            executorService.submit(() -> System.out.println("Задача выполняется в потоке: " + Thread.currentThread().getName()));
        }

        // пробуем закрыть
        executorService.shutdown();

        // ждем окончания работы 100 миллисекунд
        if (executorService.awaitTermination(100, TimeUnit.MILLISECONDS)) {
            System.out.println("Все задания выполнены!");
        } else {
            // принудительно останавливаем
            List<Runnable> notExecuted = executorService.shutdownNow();
            System.out.printf("Так и не запустилось %d заданий.%n", notExecuted.size());
        }

    }
}

