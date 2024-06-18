package src2.Function.practika;


import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * дан список строк. Найти колличество уникальных строк  длиной более  8 символов
 */
public class ListOfStringUnique {
    public static void main(String[] args) {
        List<String> list = List.of("ssdsd", "gfdgdf", "111111111", "2322212314", " fdfhjyjyj", "hjgkldgjdfgjkolp", "222222222", "22222222", "111111112", "222222222", "111111111");

        System.out.println(list.size());
        HashSet<String> set = new HashSet<>(list);
        System.out.println(set.size());

        long count = set.stream().map(String::length)
                .filter(length -> length > 8)
                .count();
        System.out.println(count);

        System.out.println(list.stream()
                .distinct()
                .map(String::length)
                .filter(length -> length > 8)
                .count());

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println
                );
    }
}
