package MANYTHREAD.Tasks;

import java.util.Queue;
import java.util.Random;

public class ProducerTHread implements Runnable{

    private final Queue<Integer> list;

    public ProducerTHread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        synchronized (list) {
            while(true) {
                int random = Util.getRandom();
                list.add(random);
                list.notifyAll();
                System.out.println( "  producer adds value: " + random + "   Size" + list.size());

                try {
                    int randomWaaitValue = Util.getRandom();
                    System.out.println(" producer wait "  + randomWaaitValue);
                    list.wait(randomWaaitValue);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

final class Util{
    private static final Random RANDOM = new Random();

    private Util() {};

    public static int getRandom() {
       return RANDOM.nextInt(10);
    }
}
