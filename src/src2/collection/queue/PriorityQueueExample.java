package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("minsk");
        queue1.offer("slutsk");
        queue1.offer("solik");
        queue1.offer("gomel");
        queue1.offer("gomel");
        System.out.println("Priority queue с Comparable");
        System.out.println(queue1);
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
    }
}
