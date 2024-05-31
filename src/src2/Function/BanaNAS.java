package Function;

import java.util.*;

public class BanaNAS {
    public static void main(String[] args) {
        Map<String, Integer> maps = new TreeMap<>(Comparator.reverseOrder());
       // fruitCounts.computeIfAbsent("банан", p -> 1); // Добавит элемент "банан"=6, так как слово "банан" содержит 6 букв 🍌
       // fruitCounts.computeIfPresent("банан", (a,k)-> (++k)); // Добавит элемент "банан"=6, так как слово "банан" содержит 6 букв 🍌
       // fruitCounts.computeIfPresent("банан", (a,k)-> (++k)); // Добавит элемент "банан"=6, так как слово "банан" содержит 6 букв 🍌
       // System.out.println(fruitCounts);

        List<String> list = List.of("1","2","11","121","3","4","1212","77","5","4","66","7","6","99","999","664","332","1","1","1","1","1","2","10");
        for (String s : list) {
            maps.merge(s, 1, Integer::sum);
        }
        System.out.println(list.size());
        System.out.println(maps.size());
        System.out.println(maps);


    }
  // public static long factorial(int n) {
  //     Map<Integer, Long> fact = new HashMap<>();
  //     return fact.computeIfAbsent(n, k -> k == 0 ? 1 : k * factorial(k - 1));
  // }

}
