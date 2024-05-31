package String;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPraktika {
    public static void main(String[] args) {
        String str1 = "Я изучаю JAVA";
        char t = 'a';
        String str2 = new String("Я изучаю JAVA");
        str1 += " и английский тоже";

        String str3 = "Я изучаю JAVA";
        String str4 = "Я изучаю JAVA";
        System.out.println("Условие на содержание   " + str1.contains(str3));
        System.out.println("str1 + str2 " + str1 == str2);
        System.out.println("str3 + str4 " + str3 == str4);
        System.out.println("str2 + str4 " + str2.equalsIgnoreCase(str4));
        System.out.println("str3 + str4 " + str3.compareToIgnoreCase(str4));

        System.out.println(Objects.equals(str2, str3));

        String strLast = "?Непонятная строка ! понимаешь, и найти не повтор символ";

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < strLast.length(); i++) {
            char current = strLast.charAt(i);
            if(strLast.indexOf(current) == strLast.lastIndexOf(current)){
                stringBuilder.append(current).append(" ");
            }
        }
        int count = 0;
        int i = 0;
        while (strLast.indexOf('и', i) != -1){
            count++;
            System.out.println(count);
            System.out.println(i);
            i = strLast.indexOf('и',i) + 1;
        }
        System.out.println("count " + count);
        System.out.println(stringBuilder.toString());

        System.out.println(strLast.substring(5, 9));
        System.out.println(strLast.substring(5));


        String regEx = "-?\\d+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher("22213.2323232");
        System.out.println(matcher.groupCount());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String s = "1212344";
        System.out.println(s.matches(regEx));

        String test = "Test     string  for split";
        String[] array = test.split("\\s+");
        System.out.println(Arrays.toString(array));
        System.out.println(test.replaceAll("(\\w+)", "($1)"));

    }
}
