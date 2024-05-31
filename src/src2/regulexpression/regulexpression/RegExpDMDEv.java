package regulexpression.regulexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDMDEv {
    public static void main(String[] args) {
        String phoneNumber = "+375(29)771-52-71";
        String regexp = "\\+375\\s?\\((29|33|44|25)\\)\\s?\\d{3}(-\\d{2}){2}";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());          //1 способ

        System.out.println(Pattern.matches(regexp, phoneNumber));   //2 способ

        System.out.println(phoneNumber.matches(regexp));    //3 способ
    }
}
