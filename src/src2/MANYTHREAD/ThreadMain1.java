package MANYTHREAD;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadMain1 {
    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() +" : " + simpleThread.getState());
        var runnableThread = new Thread(new SimpleRunnable(), " RunnableThread");
        var lambdaThread = new Thread(() -> System.out.println("Hello from lamda" + Thread.currentThread().getName()));


        simpleThread.start();
        System.out.println(simpleThread.getName() +" : " + simpleThread.getState());

        runnableThread.start();
        lambdaThread.start();


        try {
            simpleThread.join();
            System.out.println(simpleThread.getName() +" : " + simpleThread.getState());
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        simpleThread.interrupt();

        System.out.println(Thread.currentThread().getName());
    }
}
