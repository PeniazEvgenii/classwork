package MANYTHREAD.FORkJoinPool.two.First;

import java.util.concurrent.ForkJoinPool;

public class MainExampleTaskUseFork {
    public static void main(String[] args) {
        ExampleTask exampleTask = new ExampleTask();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(exampleTask));
    }
}
