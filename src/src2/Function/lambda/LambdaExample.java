package Function.lambda;

import Interface.book.Printable;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.Flow;
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
       // Comparator<Integer> comparator = new ComparatorInteger();
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(25, 100));

        Printable newspaper = () -> System.out.println("газета печать");


    }
//   private static class ComparatorInteger implements Comparator<Integer> {

  //     @Override
 //     //[модиы]возвр название параметры
 //     (Integer o1, Integer o2) {
 //         return Integer.compare(o1, o2);
 //     }
 // }
}
