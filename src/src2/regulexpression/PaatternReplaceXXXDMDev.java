package regulexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaatternReplaceXXXDMDev {
    public static void main(String[] args) {

        String phoneNumber = "fdfsdfsdf+375 (33) 771-52-71dsfsdfsdfsdf dfsdf +375(44)777-52-71 \n" +
                "dfgdf +375 (25) 111-52-25 fghdfgh +375 (25) 999-99-25 dfdsf";
        String regexp = "(?:\\+375)?\\s?\\((?<code>\\d{2})\\)\\s?(\\d{3})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(phoneNumber);

        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
            matcher.appendReplacement(stringBuilder, " xxX (XX) $2 $3 $4");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder.toString());

        System.out.println(phoneNumber.replaceAll(regexp, " xxX (XX) $2 $3 $4"));
    }
}
