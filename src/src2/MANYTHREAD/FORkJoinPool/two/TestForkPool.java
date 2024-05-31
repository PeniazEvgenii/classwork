package MANYTHREAD.FORkJoinPool.two;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TestForkPool {
    public static void main(String[] args) {
        int[] p = new int[100_000];

        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Integer invoke = forkJoinPool.invoke(new WorkPool(p));
        System.out.println(invoke);

    }

}

class WorkPool extends RecursiveTask<Integer> {
    private int[] pp;

    WorkPool(int[] pp) {
        this.pp = pp;
    }

    @Override
    protected Integer compute() {
        try {
            if(pp.length <= 10) {
                System.out.println(Thread.currentThread().getName());
                return Arrays.stream(pp).sum();
            }
        } catch (Exception e) {
            System.out.println("Поток прерван");
        }
        WorkPool halfOne = new WorkPool(Arrays.copyOfRange(pp, 0, pp.length/2));
        WorkPool halfTwo = new WorkPool(Arrays.copyOfRange(pp, pp.length/2, pp.length));
        halfOne.fork();
        halfTwo.fork();

        return halfOne.join()  + halfTwo.join();
    }
}
