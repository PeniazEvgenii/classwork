package generic.collection;

import generic.collection.dto.Timer;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1Coll {

    private final static String NUMBER = "+37529......";

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        DecimalFormat df = new DecimalFormat("###_###.####");
        Timer timer1 = insert(list1, 300_000);
        System.out.println("прошлоло: " + timer1.getTime());
        Timer timer2 =  insert(list2, 300_000);
        System.out.println("прошлоло: " + timer2.getTime());


        System.out.println(list1.size());
        System.out.println(list2.size());
    }
    public static Timer insert(List<String> container, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            container.add(NUMBER);
        }
        long stop = System.currentTimeMillis();
        System.out.println("прошлоло: " + (stop - start));
        return new Timer(start,stop);
    }
}
