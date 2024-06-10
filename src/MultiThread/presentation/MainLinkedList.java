package MultiThread.presentation;

import MultiThread.presentation.job.FigureProducerJob;
import MultiThread.presentation.job.ConsumerJob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class MainLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        ExecutorService producers = Executors.newFixedThreadPool(2);

        producers.submit(new FigureProducerJob(queue, () ->{
            ThreadLocalRandom rnd = ThreadLocalRandom.current();
            return System.currentTimeMillis() + ": First";
        }));

        producers.submit(new FigureProducerJob(queue, () ->{
            ThreadLocalRandom rnd = ThreadLocalRandom.current();
            return System.currentTimeMillis() + ": Second";
        }));




        ExecutorService consumers = Executors.newFixedThreadPool(4);

        consumers.submit(new ConsumerJob(queue));
    }
}
