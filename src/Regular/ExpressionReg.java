package Regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionReg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Проверим соответствие строки шаблону");
        String str = "Вася";

        boolean isMatch = str.matches("(в|В)ася");
        System.out.println(isMatch);
        System.out.println(isMatch ? "да" : "нет");

        String str2 = "11 2 22 33  55  4 7777";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str2);

        int kol_sovpadenii = 0;

        while (matcher.find()) {
            System.out.println(matcher.group());
            kol_sovpadenii ++;
        }
        System.out.println(kol_sovpadenii);

    }
}
