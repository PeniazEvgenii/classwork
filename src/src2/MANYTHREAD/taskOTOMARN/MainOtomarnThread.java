package MANYTHREAD.taskOTOMARN;

public class MainOtomarnThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        var thread1 = new Thread(new CounterThread(counter));
        var thread2 = new Thread(new CounterThread(counter));
        var thread3 = new Thread(new CounterThread(counter));
        var thread4 = new Thread(new CounterThread(counter));



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();

            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();


        System.out.println(counter.getCount());
    }
}
