package collection.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class NaborRunner {
    public static void main(String[] args) {
        NaborNumbers num1 = new NaborNumbers(1, 1, "1");
        NaborNumbers num29 = new NaborNumbers(1, 100, "1");
        NaborNumbers num2 = new NaborNumbers(1, 1, "19");
        NaborNumbers num3 = new NaborNumbers(1, 6, "1");
        NaborNumbers num4 = new NaborNumbers(1, 1, "21");
        NaborNumbers num5 = new NaborNumbers(1, 12, "1");
        NaborNumbers num6 = new NaborNumbers(1, 1, "3");
        NaborNumbers num7 = new NaborNumbers(1, 1, "4");
        NaborNumbers num11 = new NaborNumbers(2, 2, "1");
        NaborNumbers num12 = new NaborNumbers(3, 3, "1");
        NaborNumbers num13 = new NaborNumbers(4, 4, "1");
        NaborNumbers num14 = new NaborNumbers(5, 5, "1");
        NaborNumbers num15 = new NaborNumbers(6, 6, "1");
        NaborNumbers num16 = new NaborNumbers(2, 7, "1");
        NaborNumbers num17 = new NaborNumbers(3, 8, "1");
        NaborNumbers num18 = new NaborNumbers(4, 19, "1");
        List<NaborNumbers> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        list.add(num6);
        list.add(num7);
        list.add(num11);
        list.add(num12);
        list.add(num13);
        list.add(num14);
        list.add(num15);
        list.add(num16);
        list.add(num17);
        list.add(num18);
        list.add(num29);

        Map<NaborNumbers, Integer> map1 = new HashMap<>();

        NavigableMap<NaborNumbers, Integer> map2 = new TreeMap<>();


        list.forEach(naborNumbers -> map1.put(naborNumbers, 1));
        list.forEach(naborNumbers -> map2.put(naborNumbers, 1));


        map1.entrySet().forEach(System.out::println);
        System.out.println();
        map2.entrySet().forEach(System.out::println);

        System.out.println(map1.size());
        System.out.println(map2.size());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy года HH:mm:ss")));

    }
}
