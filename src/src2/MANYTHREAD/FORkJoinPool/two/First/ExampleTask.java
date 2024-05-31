package MANYTHREAD.FORkJoinPool.two.First;
import java.util.concurrent.RecursiveTask;
public class ExampleTask extends RecursiveTask<String> {

    @Override
    protected String compute() {
        //System.out.println("Я работаю с данным потоком: " + Thread.currentThread().getName());
        return "Класс для демонстрации ForkJoinPool";
    }
}
