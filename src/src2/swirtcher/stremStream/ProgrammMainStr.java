package swirtcher.stremStream;

import Function.practika.PersonStreaam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgrammMainStr {
    public static void main(String[] args) {
        List<PersonStreaam> person = List.of(
                new PersonStreaam("Ivan", "Ivanov2", 30),
                new PersonStreaam("Va", "Ivanov3", 50),
                new PersonStreaam("Ekaterina", "Ivanov4", 80),
                new PersonStreaam("Anatoldfgdfgii", "Ivanov5", 20),
                new PersonStreaam("Evgen", "Ivanov6", 25),
                new PersonStreaam("Karol", "Ivanov7", 25),
                new PersonStreaam("Petr", "Ivanov8", 11),
                new PersonStreaam("Petr", "Ivanov6", 11),
                new PersonStreaam("Petr", "Ivanov9", 11),
                new PersonStreaam("Naddfgdfgdfgegda", "Ivanov9", 55),
                new PersonStreaam("Ivan", "Ivanov11", 26),
                new PersonStreaam("Vasilyi", "Ivanov12", 78),
                new PersonStreaam("Sveta", "Svetikova", 20)
        );

        int[][] array = {{1,2,3,4},{1,2,3,4},{5,6,7,8},{5,6,7,8}};

        IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.
                        partitioningBy(i -> i % 2==0))
                .entrySet().forEach(System.out::println);

// false=[1, 3, 5, 7, 9]
// true=[0, 2, 4, 6, 8]

        String collect = IntStream.range(-5, 0)
                .flatMap(i -> IntStream.of(i, -i))
                .boxed()
                .sorted(Comparator.comparing(Math::abs))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(collect);


    }
}
