package regulexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaatternFindDMDev {
    public static void main(String[] args) {

        String phoneNumber = "fdfsdfsdf+375 (33) 771-52-71dsfsdfsdfsdf dfsdf +375 (44) 777-52-71" +
                "dfgdf +375 (25) 111-52-25 fghdfgh +375 (25) 999-99-25";
        String regexp = "(?:\\+375)?\\s?\\((?<code>\\d{2})\\)\\s?\\d{3}-\\d{2}-\\1";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(phoneNumber);

        System.out.println(matcher.groupCount());

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("code"));
        }
    }
}
