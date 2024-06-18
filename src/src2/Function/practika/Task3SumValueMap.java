package src2.Function.practika;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дана Map<String, Integer>. Найти сумму элементов, ключи которой меньше 7 символов
 */
public class Task3SumValueMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("111111", 11,
                                          "222222", 22,
                                          "333333", 33,
                                          "444444", 44,
                                          "555555", 55,
                                          "666666", 66,
                                          "11111111", 111,
                                          "99999999", 99
        );

        Set<String> collect = map.keySet().stream().filter(key -> key.length() < 7).collect(Collectors.toSet());
        int count = 0;

        for (String col : collect) {
            count += map.get(col);
        }
      //  System.out.println(count);

        map.entrySet().stream()
                .filter(keyVal -> keyVal.getKey().length() <= 6)
                .map(Map.Entry::getValue)
                .reduce(Integer::sum)
                        .ifPresent(System.out::println);
    }
}
