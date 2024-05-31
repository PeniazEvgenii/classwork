package present.ExecutorServiceMethods;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllTimeUnit_3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //список Callable задач
        List<Callable<Integer>> tasks = Arrays.asList(
                () -> {
                    Thread.sleep(1000);
                    return 1;
                },
                () -> {
                    Thread.sleep(2000);
                    return 2;
                },
                () -> {
                    Thread.sleep(10000); // Долгая задача
                    return 3;
                }
        );

        try {
            /*
             * Метод List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit);
             *  Параметр tasks - коллекция вызываемых Callable задач.
             *  Параметр timeout – максимальное время ожидания
             *  unit - единица измерения времени
             *  Возвращает список Future после завершения выполнения всех переданных задач.
             */
            List<Future<Integer>> futures = executorService.invokeAll(tasks, 3, TimeUnit.SECONDS);

            System.out.println("Размер списка с результатом - " + futures.size());
            for (Future<Integer> future : futures) {
                if (!future.isCancelled()) {
                    try {
                        Integer result = future.get();
                        System.out.println("Результат задачи: " + result);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Задача отменена из-за превышения времени ожидания.");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
