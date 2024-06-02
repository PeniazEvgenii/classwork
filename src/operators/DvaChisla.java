package operators;

import java.util.Scanner;

public class DvaChisla {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Введи первое число\n");
        int a = console.nextInt();
        System.out.print("Введите второе число\n");
        int b = console.nextInt();
        int d = 42;
        String str22 = Integer.toBinaryString (d);
        System.out.println(str22);


        String result;
        String pattern = "результат сравнения на равенство: %8s. И округление равно %.3f %n";
        double primer = 10.0/3;

        if (a == b){
            result = "равны";
       } else {
            result = "!равны";
            ;
        }

        System.out.printf(pattern, result, primer);
    }
}


