package collection;

import java.sql.Time;
import java.util.*;

public class ArrayListRunner {
    public static void main(String[] args) {

        List <Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(5);list.add(2);
        list.add(6);list.add(2);
        list.add(3);list.add(2);
        list.add(7);list.add(2);
        list.add(9);list.add(2);
        list.add(11);list.add(2);
        list.add(12);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        list.forEach(System.out::print);
        Map<Integer, Time> map = new HashMap<>();
        Time time1 = new Time(2);
        map.put(1,time1);
        map.put(2,time1);
        map.put(3,time1);
        System.out.println();
        System.out.println(map.entrySet());
        System.out.println(map.values());
        map.putIfAbsent(2, time1);
        map.getOrDefault(5, null);
        list.sort(Comparator.comparing(Integer::doubleValue));
        list.forEach(System.out::print);


    }

}
