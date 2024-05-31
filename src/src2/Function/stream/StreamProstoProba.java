package Function.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamProstoProba {
    public static void main(String[] args) {

        List<String> list = List.of("1","2","11","121","3","4","1212","77","5","4","66","7","6","99","999","664","332","1","2","10");

        List<Integer> collNew = list.stream().map(str -> str + str)
                .map(Integer::valueOf)
                .filter(i -> i < 2000)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        collNew.forEach(System.out::println);

        list.stream().map(str -> str + str)
                .map(Integer::valueOf)
                .filter(i -> i < 2000)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue);

        IntStream.range(1, 100);

        IntStream.iterate(0, a-> a+3);


    }
}
