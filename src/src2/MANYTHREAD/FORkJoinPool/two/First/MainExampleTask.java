package MANYTHREAD.FORkJoinPool.two.First;

public class MainExampleTask {
    public static void main(String[] args) {
        ExampleTask exampleTask = new ExampleTask();
        exampleTask.fork();
        System.out.println(exampleTask.join());
    }
}
