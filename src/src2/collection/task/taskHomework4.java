package collection.task;

import java.util.*;

public class taskHomework4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polinomial1 = Map.of(
                0,5,
                1,3,
                3,2,
                5,4,
                6,7
        );
        Map<Integer, Integer> polinomial2 = Map.of(
                0,5,
                3,4,
                5,5,
                6,1
        );
        System.out.println(sum(polinomial1, polinomial2));
    // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
        System.out.println(convertToString(sum(polinomial1, polinomial2)));

    }
    public static Map<Integer, Integer> sum (Map<Integer, Integer> polinomial1,
                                             Map<Integer, Integer> polinomial2) {
        Map<Integer, Integer> polinomialresult = new HashMap<>(polinomial1);
        for (Map.Entry<Integer, Integer> entry : polinomial2.entrySet()) {
//           Integer value = polinomialresult.getOrDefault(entry.getKey(), 0);
//           polinomialresult.put(entry.getKey(), value + entry.getValue());
            polinomialresult.merge(entry.getKey(), entry.getValue(), (newValue, oldValue)->newValue + oldValue);
        }
        
        return  polinomialresult;
    }

    public static String convertToString (Map<Integer, Integer> polinomial) {
        Map<Integer,Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(polinomial);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            list.add(entry.getValue() + "x^" + entry.getKey());
        }
        return String.join(" + ",list);
    }
}
