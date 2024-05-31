package regulexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task16numberReg {
    public static void main(String[] args) {
        String regexp = "0[x|X][\\da-fA-f]+";
        String input = "dasdasd 0xff saadasd 0x12 df 0XAB";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
