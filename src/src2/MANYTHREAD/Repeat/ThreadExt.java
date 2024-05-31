package MANYTHREAD.Repeat;

public class ThreadExt extends Thread {
    private int i = 0;

    public int getI() {
        return i;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            i++;
        }
        System.out.println("поток наследник   - " + getName() );
    }
}
class ThreadRunbl implements Runnable {

    @Override
    public void run() {
        System.out.println("поток переопределяшка   - " + Thread.currentThread().getName());

    }
}

class Mainik {
    public static void main(String[] args) {

        var threadExt = new ThreadExt();
        var threadExt1 = new ThreadExt();
        var threadExt2 = new ThreadExt();
        var threadExt3 = new ThreadExt();
        var threadRun = new Thread(new ThreadRunbl());
        var threadLambda = new Thread(() -> System.out.println("поток переопределяшкаЛЯТМБДА   - " + Thread.currentThread().getName()));
        System.out.println(threadRun.getState());

        threadExt.start();
        threadExt1.start();
        threadExt2.start();
        threadExt3.start();
        threadRun.start();
        threadLambda.start();
        System.out.println(threadRun.getState());

        try {
            threadExt.join();
            threadExt1.join();
            threadExt2.join();
            threadExt3.join();
            threadRun.join();
            threadRun.join();
            System.out.println(threadRun.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadExt.interrupt();
        threadExt1.interrupt();
        threadExt2.interrupt();
        threadExt3.interrupt();
        threadRun.interrupt();
        threadRun.interrupt();

       System.out.println(threadRun.getState());

        System.out.println("main " + Thread.currentThread().getName());

        System.out.println(threadExt.getI());
        System.out.println(threadExt1.getI());
        System.out.println(threadExt2.getI());
        System.out.println(threadExt3.getI());






    }
}
