package MANYTHREAD.FORkJoinPool.two;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class BigArray {
    public static void main(String[] args) throws InterruptedException {

        SetArrayIndex setArray = new SetArrayIndex();
        int[] array = setArray.getInitArray(10000);

        ArrayWithFJP arrayWithFJP = new ArrayWithFJP(array);

        System.out.println(new Date());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(arrayWithFJP));
        System.out.println(new Date());
    }
}
