package MANYTHREAD.TasksConcurrent;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainRead1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();



        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
          int  seconds = scanner.nextInt();
          if(seconds < 0) {
              break;
          }

            executorService.submit(() -> {
                Integer counter = threadLocal.get();
                threadLocal.set(counter == null ? 1 : ++counter);
                System.out.printf("Поток %s , задач %d%n",Thread.currentThread().getName(), threadLocal.get());

                Thread.sleep(seconds * 1000L);
                System.out.printf("Поток %16s спал %5.2f секунд%n", Thread.currentThread().getName(), seconds*1.);
                return true;
            });

        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
