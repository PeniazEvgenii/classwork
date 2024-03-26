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
       int i =0;
        do{
           answer = console.nextLine();
           if(!isExit(answer)) {
               Long[] temp = new Long[arr.length + 1];
               for (int i1 = 0; i1 < arr.length; i1++) {
                   temp[i1] = arr[i1];
               }
               arr = temp;
               arr[i++] = Long.valueOf(answer);
           }
       } while(!isExit(answer));

    }
    public static boolean isExit(String answer){
       return Objects.equals(answer,"exit") ;
    }
}
