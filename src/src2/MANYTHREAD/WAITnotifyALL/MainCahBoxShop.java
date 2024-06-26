package MANYTHREAD.WAITnotifyALL;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCahBoxShop {
    public static void main(String[] args) throws InterruptedException {
        //BlockingQueue<CashBox> cashBoxes = new ArrayBlockingQueue<>(2, true,List.of(new CashBox(), new CashBox()));
    Semaphore cashBoxes = new Semaphore(2);
        List<Thread> collect = Stream.of(
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes)
                ).map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());
        for (Thread thread : collect) {
            thread.join();
        }
    }
}
