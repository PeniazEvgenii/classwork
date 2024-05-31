package regulexpression;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {
   public static Pattern pattern;
    public static Matcher matcher;

    public static final String TEMPLATE_NUMBER = "\\+375\\(?(29|33|44|25)\\)?\\d{3}([\\s-]?\\d{2}){2}";

    public static boolean isCheckNumber (String s) {
        matcher = pattern.matcher(s);
        return matcher.matches();
    }



    public static void main(String[] args) {
        pattern = Pattern.compile(TEMPLATE_NUMBER);
        System.out.println(isCheckNumber("+37529771 52 71"));

        String str = "-4443.43224";
        System.out.println(str.matches("-?\\d+\\.\\d+"));

        String  str1 = "1234567890"; //(123)-456-7890
        String str2 = str1.replaceAll("","($1)-$2-$3");
        System.out.println(str2);

        String pat = "привет";
        int count = 0;

        Pattern pattern1 = Pattern.compile(pat);
        String str3 = "привет привет привет дядьк ваыва привет ывоалыва привет Петоровияпривет";
        Matcher matcher1 = pattern1.matcher(str3);
        System.out.println(matcher1.groupCount());

        while (matcher1.find()) {
            count++;
            System.out.println(matcher1.group() + "  " + matcher1.start() + " " + matcher1.end());
        }
        System.out.println(count);

        String[] array;
        String str11 = "Test   string for split\tsplit ";
        array = str11.split("\\s+");


        StringBuilder stringBuilder = new StringBuilder();
        for (String s : array) {
            stringBuilder.append(s).append(" ");
        }
        System.out.println(stringBuilder.toString());


         System.out.println();
        String str111 = String.join(" ", array);
        System.out.println(str111);


    }
}
