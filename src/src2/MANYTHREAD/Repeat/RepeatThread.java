package MANYTHREAD.Repeat;

public class RepeatThread {
    public static void main(String[] args) {
        var threadExtends = new ThreadExtends();
        var threadRunnable = new Thread(new ThreadRunnable());
        var threadLambda = new Thread(() -> System.out.println("Lambda thread имя - " + Thread.currentThread().getName()));

        threadExtends.start();
        threadRunnable.start();
        threadLambda.start();

        try {
            threadExtends.join();
            threadRunnable.join();
            threadLambda.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadExtends.interrupt();
        threadRunnable.interrupt();
        threadRunnable.interrupt();

        System.out.println("Main " + Thread.currentThread().getName());
    }
}
class ThreadExtends extends Thread {
    @Override
    public void run() {
        System.out.println("Thread extends имеет имя потока - " + getName());
    }
}

class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Runnable имеет имя потока - " + Thread.currentThread().getName());
    }
}
