package MANYTHREAD.FORkJoinPool.two;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class ArrayWithFJP extends RecursiveTask <Integer> {
    private int[] array;

    public ArrayWithFJP(int[] array) {
        this.array = array;
    }

    @Override
    protected Integer compute() {
        try {

            if (array.length <= 1000) {
                System.out.printf("Задача %s выполняется в потоке %s%n", this, Thread.currentThread().getName());
                Thread.sleep(1);
                return Arrays.stream(array).sum();
            }
        }catch (InterruptedException exp) {
            System.out.println("Поток прерван");
        }
            ArrayWithFJP firstHalfArrayValueSumCounter = new ArrayWithFJP(Arrays.copyOfRange(array, 0, array.length / 2));
            ArrayWithFJP secondHalfArrayValueSumCounter = new ArrayWithFJP(Arrays.copyOfRange(array, array.length / 2, array.length));
            firstHalfArrayValueSumCounter.fork();
            secondHalfArrayValueSumCounter.fork();
            return firstHalfArrayValueSumCounter.join() + secondHalfArrayValueSumCounter.join();

    }
}
