package src2.MANYTHREAD.FORkJoinPool.two;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class BigArray {
    public static void main(String[] args) throws InterruptedException {

        MANYTHREAD.FORkJoinPool.two.SetArrayIndex setArray = new MANYTHREAD.FORkJoinPool.two.SetArrayIndex();
        int[] array = setArray.getInitArray(10000);

        MANYTHREAD.FORkJoinPool.two.ArrayWithFJP arrayWithFJP = new MANYTHREAD.FORkJoinPool.two.ArrayWithFJP(array);

        System.out.println(new Date());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(arrayWithFJP));
        System.out.println(new Date());
    }
}
