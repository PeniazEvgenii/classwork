package regulexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberReg {
    public static void main(String[] args) {
        String phoneNumber = "+375 (29) 771-52-71 dfsfdsfds +375(29)771-55-55fghfghgfhgf" +
                " +375 (44) 333-33-33sdfsdfsdfsdf +375 (25) 771-52-99";
        String regex = "(?<index>\\+375)\\s?\\((?<code>\\d{2})\\)\\s?(\\d{3})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.groupCount());

        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder, "$1 ($2) XXX_XXX_$5");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);


        while(matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group("code"));
        }
    }
}
