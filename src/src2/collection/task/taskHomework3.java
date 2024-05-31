package collection.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Map <String, String> и возвр true если:
 * каждому ключу соответствует уникальное значеник
 * {Marty==Step, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 * {Kendrick=Perkins,Stuart=Reges, Jessica=Miller,Bruce=Reges, Hal=Perkins}
 */
public class taskHomework3 {
    public static void main(String[] args) {
       // Map<String, String> map = new HashMap<>();
       //map.put("Marty", "Step");
       //map.put("Stuart", "Reges");
       //map.put("Jessica", "Miller");
       //map.put(" Amanda", "Hal");
       //map.put("Hal", "Hal");
        Map<String, String> map = Map.of(
                "Marty", "Step",
                "Stuart", "Reges",
                "Jessica", "Miller",
                " Amanda", "Hal",
                "Hal", "Hal"
        );
        System.out.println(isUnique(map));

    }
    public static boolean isUnique(Map<?, ?> map) {
        return new HashSet<>(map.values()).size() == map.size();
    }
}
