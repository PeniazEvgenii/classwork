package operators;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Format {

    public static Scanner console = new Scanner(System.in);

    public static final String name1 = "Анастасия";
    public static final String name2 = "Василий";

    public static int getInt () {
        int temp;

        if (console.hasNextInt()) {
            temp = console.nextInt();
            if (temp <= 0) {
                System.out.println("Введено число меньше нуля. Введите еще раз");
                temp = getInt();
            }
        } else {
            System.out.println("Введено число за пределами диапозона int");
            console.next();
            temp = getInt();
        }

        return temp;
    }


    public static void main(String[] args) {
       /* System.out.println("Введите first целое число");
       * int num1 = getInt();
       * System.out.println("Введите second целое число");
       * int num2 = getInt();
       * System.out.printf("Введены числа:% d и %d %n", num1, num2);
       */
     /*  System.out.println("введите любой символ");
      *  char symbol1 = console.next().charAt(0);
      *  System.out.println(symbol1);
      *   System.out.println(Character.isAlphabetic(symbol1));
      */
        /*
        int mass [] = {1,2,3,4,5,6,7,8,9,0};
        String template = "Привет %10s. Как %s? Купи %10.2f воды%n";
        System.out.printf(template, "Вася", "работа", 10.0 / 26);

        float value = 0.12121212F;
        System.out.println(new DecimalFormat("#.##").format(value));

        String str1 = "Привет";
        String str2 = "Привет";
        String str3 = new String("Привет");
        System.out.println("интерн   " + str1.intern());
        System.out.println(str3.intern());
        System.out.println(str1 == str2);
        System.out.println(str1 == str3.intern());
        */

    }
}
