package Adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {
    public static void main(String[] args) {
        Pattern pattern1111 = Pattern.compile("(\\d(\\d+))\\s(\\d+)");
        Matcher matcher = pattern1111.matcher("533 444");
        System.out.println(matcher.groupCount());
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
