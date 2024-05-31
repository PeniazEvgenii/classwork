package MANYTHREAD.FORkJoinPool.two;


import MANYTHREAD.FORkJoinPool.two.First.ExampleTask;

public class MainExampleTaskUseFork {
    public static void main(String[] args) {
    ExampleTask exampleTask = new ExampleTask();
        exampleTask.fork();
    System.out.println(exampleTask.join());
    }
}
