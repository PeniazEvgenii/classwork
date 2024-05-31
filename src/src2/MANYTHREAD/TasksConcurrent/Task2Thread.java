package MANYTHREAD.TasksConcurrent;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task2Thread {
    public static void main(String[] args) {
        int[] values = new int[1_000_000_0];
        ThreadLocalRandom random = ThreadLocalRandom.current();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1, 301);
        }


        getTime(() -> {
            try {
                return findMaxParallel(values,executorService);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
       getTime(() -> findMAx(values));

       executorService.shutdownNow();

    }

    private static int getTime(Supplier<Integer> task) {
        long l1 = System.currentTimeMillis();
        int result = task.get();
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
        return result;
    }

    private static int findMAx(int[] values) {
        return Arrays.stream(values)
                .summaryStatistics()
                .getMax();
    }

    private static int findMaxParallel(int[] values, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() -> IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MAX_VALUE)).get();
    }
}
