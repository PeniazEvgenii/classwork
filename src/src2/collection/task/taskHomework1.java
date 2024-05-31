package collection.task;

import java.util.ArrayList;
import java.util.List;

/**
 * написать метод, принимающий целочисленный список и возвращ список с нечетными значениями
 */
public class taskHomework1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,6,8,9,13,20);
        List<Integer> result = removeEven(list);
        System.out.println(result);

        List<Double> list1 = List.of(4.4,4.0,3.3,2.2,88.5,44.9);
        System.out.println(removeEven(list1));
    }
    public static<T extends Number> List<T> removeEven (List<T> list) {
        List<T> list1 = new ArrayList<>();
        for (T t : list) {
            if(t.doubleValue() % 2 != 0) {
               list1.add(t);
            }
        }
        return list1;
    }
}
