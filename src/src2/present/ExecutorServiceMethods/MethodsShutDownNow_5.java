package present.ExecutorServiceMethods;

import java.util.List;
import java.util.concurrent.*;

public class MethodsShutDownNow_5 {
    public static void main(String[] args) {

        /**
          В выводе есть 2 вида строк:
         * число — это значит, что эта задача успела обработаться ExecutorService, и вывелось число из списка, из которого мы создавали задачи.
         * объект типа FutureTask, после вызова у него метода toString(). Это задачи, которые были переданы ExecutorService на выполнение, но не были обработаны.
         */

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer i : list) {
            executorService.submit(() -> System.out.println(i));
        }
        List<Runnable> notExecutedTasks = executorService.shutdownNow();

        notExecutedTasks.forEach(System.out::println);

        System.out.println("Невыполненные задачи количество: " + notExecutedTasks.size());

    }
}
