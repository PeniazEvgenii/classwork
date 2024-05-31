package MANYTHREAD.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable{

    private final RocketDetail rocketDetail;
    private final CountDownLatch countDownLatch;

    public RocketDetailRunnable(RocketDetail rocketDetail, CountDownLatch countDownLatch) {
        this.rocketDetail = rocketDetail;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("готовиться деталь " + rocketDetail);
        try {
            Thread.sleep(1000L);
            System.out.println("готова деталь " + rocketDetail);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
