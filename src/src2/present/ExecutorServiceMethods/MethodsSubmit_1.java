package present.ExecutorServiceMethods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MethodsSubmit_1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        /*
         *  Метод Future<?> submit(Runnable task);
         *  task - выполняемая Runnable задача
         *  возвращает объект Future
         *  Если вызвать метод get() у полученного объекта Future, то получим null.
         */

        Future<?> result = executorService.submit(
                () -> System.out.println("I'm Runnable task. Задача1 выполняется в потоке: " + Thread.currentThread().getName())
        );

        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }


        /*
         * Метод <T> Future<T> submit(Runnable task, T result);
         * task - выполняемая Runnable задача
         * T result — это заданный результат, который вернет вызов метода get() у полученного объект Future.
         * возвращает объект Future
         */
        Future<String> result2 = executorService.submit(
                (() -> System.out.println("\nI'm Runnable task.Задача2 выполняется в потоке: " + Thread.currentThread().getName())),
                "! ЗАДАННЫЙ РЕЗУЛЬТАТ !");

        try {
            System.out.println("результат выполнения задачи2 : " + result2.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }



        /*
         * Метод <T> Future<T> submit(Callable<T> task);
         * task - выполняемая Callable задача
         *  возвращает объект Future.
         * <T> — тип результата переданной задачи.
         */
        Future<Integer> result3 = executorService.submit(() -> {
            System.out.println("\nI'm Callable task. Задача3 выполняется в потоке: " + Thread.currentThread().getName());
            return 10 * 20;
        });

        try {
            System.out.println("результат выполнения задачи3 : " + result3.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
