package MANYTHREAD;

public class SimpleThread extends Thread {
    @Override
    public void run() {
//        System.out.println("hello " + Thread.currentThread().getName());
        System.out.println("hello " + getName());
    }
}
