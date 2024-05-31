package Function.stream;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Вводится целое число N (1 <= N <= 10^5), далее вводится N целых чисел (каждое не превосходит 10^9 по модулю).
 * Вывести число, которое повторяется чаще всего. Если таких несколько - вывести наименьшее из них.
 */
public class TaaskAboutNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;
        boolean checkNumber;

            do {
                System.out.println("Введи число от 1 до 10e5");
                try {
                    inputNumber = scanner.nextInt();
                } catch(InputMismatchException e) {
                    checkNumber = true;
                    scanner = new Scanner(System.in);
                    System.out.println("введено неверное значение не int");
                }
                checkNumber =  inputNumber >= 1 && inputNumber <= 100_000;
                if(!checkNumber) {
                    System.out.println("введено неверное значение");
                }
            } while(!checkNumber);




        Map<Integer,Integer> map = new HashMap<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < inputNumber; i++) {
            int temp = random.nextInt(10000);
            map.merge(temp,1, Integer::sum);
        }
        System.out.println(map.size());
        System.out.println(map.entrySet());

       // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
       //     if(entry.getValue() > 3) {
       //         System.out.println(entry);
       //     }
       // }
        Integer integer = map.values().stream()
                .max(Integer::compare).get();
        System.out.println(integer);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(integer.equals(entry.getValue())){
                System.out.print(entry + " ");
            }
        }

        System.out.println();
        System.out.println(map.entrySet().stream()
                .filter(p -> p.getValue() >= map.values().stream()
                        .max(Integer::compare).get())
                .mapToInt(Map.Entry::getKey)
                .summaryStatistics()
                .getMin());
    }
}
