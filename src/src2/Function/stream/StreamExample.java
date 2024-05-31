package Function.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = List.of("11", "22", "33","88", "44", "55","66");

        IntSummaryStatistics intSummaryStatistics = list.stream()
                .map(str -> str + str)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted((value1, value2) -> Integer.compare(value2, value1))
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                  .summaryStatistics();
        //   .forEach(System.out::println);

        System.out.println(intSummaryStatistics);

        System.out.println(list.stream().mapToInt(Integer::parseInt)
                .summaryStatistics());

        IntStream.iterate(0, a -> a + 3)
                .limit(100)
                .forEach(System.out::println);


        //for (String str : list) {
       //    String value = str + str;
       //    Integer intValue = Integer.valueOf(value);
       //    if(intValue % 2 == 0){
       //        System.out.println(intValue);
       //    }
       //}



    }
}
