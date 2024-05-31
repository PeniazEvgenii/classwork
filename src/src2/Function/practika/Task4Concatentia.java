package Function.practika;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список целых чисел. вывести стрроку, проедставлябющую конкатенацию строковыъ представлений
 * чисел {5,4,3,2,1} , Результат "54321"
 */
public class Task4Concatentia {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 4, 3, 2, 1);

        String collect = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(collect);


        list.stream().map(String::valueOf)
                .reduce(String::concat)
                .ifPresent(System.out::println);
    }
}
