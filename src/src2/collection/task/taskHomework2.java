package collection.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * написать метод, который принимает целочисл список с возвр количество уникальные числа
 * если список пустой вернуть 0
 */
public class taskHomework2 {
    public static void main(String[] args) {
        List <Integer> list = List.of(3,7,3,-1,2,3,7,2,15,15,4);
        System.out.println(countUnique(list));
    }
    public static int countUnique(List<Integer> list) {
       // int result = 0;
       // if (list.isEmpty()){
       //     return result;
       // }
       // for (int i = 0; i < list.size(); i++) {
       //     if(list.indexOf(list.get(i)) == list.lastIndexOf(list.get(i))) {
       //         result++;
       //     }
       // }
       // return result;
        return new HashSet<>(list).size();
    }



}
