package MANYTHREAD.Tasks;

import java.util.LinkedList;
import java.util.Queue;

public class MainTaskTrst {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();
        Thread producerTHread = new Thread( new ProducerTHread(queue));
        Thread consumerThread = new Thread( new ConsumerThread(queue));

        producerTHread.start();
        consumerThread.start();

        producerTHread.join();
        consumerThread.join();

    }
}
