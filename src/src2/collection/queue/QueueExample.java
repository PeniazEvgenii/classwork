package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>();
        queue.offer("Харьков");
        queue.offer("Киев");
        queue.offer("Кремк");
        queue.offer("Ливов");
        queue.add("dfd");
        System.out.println(queue);
        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
        }
    }
}
