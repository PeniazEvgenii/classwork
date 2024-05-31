package String;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Strin {
    public static void main(String[] args) {
        String str1 = new String( "Дядя Вася");
        String str2 = new String( "Дядя Вася");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1, str2));

        String s = str1.substring(5);
        System.out.println(s);

        // найти символ который встречается 1 раз

        String test = "?,найтисимволкоторый -встречается1раз.";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            if (test.indexOf(test.charAt(i)) == test.lastIndexOf(test.charAt(i)) )  {
                stringBuilder.append(test.charAt(i)).append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
        String a = 555 + " dfdfd fdfdf ee ";
        Scanner scanner = new Scanner(a).useLocale(Locale.US);
        scanner.useDelimiter(" ");
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        String test1 = "?,найтисимвоалкоторыай а-встречааетсяа1раз..а";
        System.out.println(test1.indexOf("а", test1.indexOf("а") + 1));

        

    // String ss = " Я не люблю Java Я не люблю Java Я не люблю Java  Я не люблю Java Я не люблю Java Я не люблю Java " +
    //         " Я не люблю Java Я не люблю Java Я не люблю Java Я не люблю Java Я не люблю Java Я не люблю Java ";
    // int result = 0;
    // int count=0;
    // int index = 0;
    // while (result != -1){
    //     result = ss.indexOf("не", index);
    //     index = result + 1;
    //     if(result != -1){
    //         count++;
    //     }
    // }
    // System.out.println(count);


    }
}
