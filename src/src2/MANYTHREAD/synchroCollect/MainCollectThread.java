package MANYTHREAD.synchroCollect;

import java.util.concurrent.*;

public class MainCollectThread {
    public static void main(String[] args) {
        ConcurrentHashMap <Integer, Integer> map = new ConcurrentHashMap<>();

        ConcurrentSkipListMap <Integer, Integer> map1 = new ConcurrentSkipListMap<>();

        ConcurrentSkipListSet <Integer> set1 = new ConcurrentSkipListSet<>();

        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        BlockingQueue<Integer> queue;
        BlockingDeque<Integer> deque;
    }
}
