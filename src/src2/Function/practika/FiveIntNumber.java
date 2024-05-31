package Function.practika;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;


/**
 * Дан список целых чисел и найти среднее всех нечетных деляшихся на 5
 */
public class FiveIntNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 1, 2, 3, 4, 5, 6, 3, 5, 55);

        IntPredicate predicate1 = a -> a % 2 != 0;
        IntPredicate predicate2 = a -> a % 5 == 0;
        IntPredicate predicate3 = predicate1.and(predicate2);


        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
               // .filter(num -> num % 2 != 0)
               // .filter(num -> num % 5 == 0)
               // .filter(num -> num % 2 != 0 && num % 5 == 0)
                .filter(predicate3)
                .average();

        average.ifPresent(System.out::println);

    }
}
