package MANYTHREAD.TasksConcurrent;

public class ThreadSleeping implements Runnable{
    public ThreadSleeping() {
    }

    private  int count;

    public ThreadSleeping(int count) {
        this.count = count;
    }


    @Override
    public void run() {
        System.out.println("\"Я спал "+ 5 + " секунд\" " + Thread.currentThread().getName());

        try {
            Thread.sleep(5 * 1000L);
            System.out.println("\"Я спал "+ count + " секунд\" " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
