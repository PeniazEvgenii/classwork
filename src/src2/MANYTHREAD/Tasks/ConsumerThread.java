package MANYTHREAD.Tasks;

import java.util.Queue;

public class ConsumerThread implements Runnable{
   private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
      while(true) {
          synchronized (list){
              if(!list.isEmpty()) {
                  Integer removedValue = list.remove();
                  System.out.println("Consumer get value " + removedValue + "   Size " + list.size());
              } else {
                  System.out.println("Consumer is empty.  list is empty");

              }
              try {
                  int random = Util.getRandom();
                  System.out.println("Consumer wait  " + random);
                 list.notifyAll();
                  list.wait(random);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
      }





    }
}
