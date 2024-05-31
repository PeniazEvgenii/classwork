package MANYTHREAD.DEadlock;

public class MainDeadlock {
    public static void main(String[] args) throws InterruptedException {
        Accaunt accaunt1 = new Accaunt(20_000);
        Accaunt accaunt2 = new Accaunt(20_000);

        AccountThread accountThread1 = new AccountThread(accaunt1, accaunt2);
        AccountThread accountThread2 = new AccountThread(accaunt2, accaunt1);

        accountThread1.start();
        accountThread2.start();

        accountThread1.join();
        accountThread2.join();

        System.out.println(accaunt1);
        System.out.println(accaunt2);
    }
}
