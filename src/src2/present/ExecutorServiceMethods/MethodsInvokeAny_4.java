package present.ExecutorServiceMethods;

import java.util.List;
import java.util.concurrent.*;

public class MethodsInvokeAny_4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Создадим список Callable задач, возвращающих строку
        List<Callable<String>> tasks = List.of(
                () -> "Задача1 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача2 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача3 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача4 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача5 выполняется в потоке - " + Thread.currentThread().getName()
        );

        /*
         *  Метод <T> T invokeAny(Collection<? extends Callable<T>> tasks)
         *  Параметр tasks - коллекция вызываемых Callable задач.
         *  Возвращает результат, первой завершившейся задачи
         */

        try {
            String result = executorService.invokeAny(tasks);
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
