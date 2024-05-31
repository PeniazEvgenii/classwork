package Function.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        String str = "one";
        Supplier<String> supplier = () -> str.toUpperCase();
        Supplier<String> supplier2 = str::toUpperCase;
        System.out.println(supplier.get());

        //случайное число от 0 до 10

        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        Supplier<Integer> randNum = () -> rnd.nextInt(1,11);
        System.out.println(randNum.get());

        List<Integer> list  = new ArrayList<>();
        int i = 1;
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i++);
        list.add(i);
       // list.removeIf(a -> a > 5);
        list.forEach(System.out::println);
        list.replaceAll(a -> a-1);
        list.sort((a,b) -> b - a);
        System.out.println(list);
    }
}
