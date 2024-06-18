package src2.Function.practika;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ONETASK {
    public static void main(String[] args) {

/**
 * дан список строк. Найти колличество уникальных строк  длиной более  8 символов
 */
        List<String> list = List.of("ssdsd", "gfdgdf", "111111111", "2322212314", " fdfhjyjyj", "hjgkldgjdfgjkolp", "222222222", "22222222", "111111112", "222222222", "111111111");

        long count = list.stream()
                .distinct()
                .map(String::length)
                .filter(s -> s >= 8)
                .count();
        System.out.println(count);

        /**
         * Дан список целых чисел и найти среднее всех нечетных деляшихся на 5
         */
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 1, 2, 3, 4, 5, 6, 3, 5, 55);

        double average = list1.stream()
                .filter(i -> i % 2 != 0)
                .filter(i -> i % 5 == 0)
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        System.out.println(average);
/**
 * Дана Map<String, Integer>. Найти сумму элементов, ключи которой меньше 7 символов
 */

        Map<String, Integer> map = Map.of("111111", 11,
                "222222", 22,
                "333333", 33,
                "444444", 44,
                "555555", 55,
                "666666", 66,
                "11111111", 111,
                "99999999", 99
        );
        map.entrySet().stream()
                .filter(k -> k.getKey().length() <= 7)
                .map(Map.Entry::getValue)
                .mapToInt(Integer::intValue)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        /**
         * Дан список целых чисел. вывести стрроку, проедставлябющую конкатенацию строковыъ представлений
         * чисел {5,4,3,2,1} , Результат "54321"
         */

        List<Integer> list3 = List.of(5, 4, 3, 2, 1);
        String collect = list3.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("-"));
        System.out.println(collect);
        List<PersonStreaam> person = List.of(
                new PersonStreaam("Ivan", "Ivanov2", 30),
                new PersonStreaam("Va", "Ivanov3", 50),
                new PersonStreaam("Ekaterina", "Ivanov4", 80),
                new PersonStreaam("Anatoldfgdfgii", "Ivanov5", 20),
                new PersonStreaam("Evgen", "Ivanov6", 25),
                new PersonStreaam("Karol", "Ivanov7", 25),
                new PersonStreaam("Petr", "Ivanov8", 11),
                new PersonStreaam("Naddfgdfgdfgegda", "Ivanov9", 55),
                new PersonStreaam("Ivan", "Ivanov11", 26),
                new PersonStreaam("Vasilyi", "Ivanov12", 78),
                new PersonStreaam("Sveta", "Svetikova", 20)
        );

        person.stream()
                .filter(p -> p.getFirstName().length() + p.getLastName().length() < 15)
                .max(Comparator.comparing(PersonStreaam::getAge))
                .map(PersonStreaam::getLastName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> collect1 = person.stream()
                .collect(Collectors.groupingBy(PersonStreaam::getAge, Collectors.mapping(PersonStreaam::getFullName, Collectors.toList())));

    }
}
