package OOPdmdev.lesson11;

import java.util.Random;

public interface Printabale {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom(){
        System.out.println(RANDOM.nextInt(1000));

        print();
    }
    void print();
}
