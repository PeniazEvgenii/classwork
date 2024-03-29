package generic;

import java.util.Objects;
import java.util.Scanner;

public class MainGeneric2 {
    public static void main(String[] args) {
        Long[] arr = new Long[0];

        Scanner console = new Scanner(System.in);
        System.out.println("Вводите числа для массива");
        System.out.println("введите exit для окончания");
       String answer = "";
       int i = 0;
        do{
           answer = console.nextLine();
           if(!isExit(answer)) {
               arr = copyOf(arr, arr.length + 1);
               arr[i++] = Long.valueOf(answer);
           }
       } while(!isExit(answer));

    }


    public static boolean isExit(String answer){
       return Objects.equals(answer,"exit") ;
    }

    /**
     * копирование массива с увелич размера
     * @param arr массив для копирования
     * @param newLength новая длина массива
     * @return новыц массив заданного размера
     */
    public static Long[] copyOf(Long[] arr, int newLength){
        Long[] temp = new Long[newLength];
        int iterationCount = Math.min(arr.length, newLength);
        for (int a = 0; a < iterationCount; a++) {
            temp[a] = arr[a];
        }
        return temp;
    }
}
