package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private Pattern pattern1, pattern2;
    private Matcher matcher;
    private static final  String NUMBER = "\\+375\\(?(29|33|44|25)\\)?\\d{3}(-?\\d{2}){2}";

    public boolean checkNumber (String num) {
        matcher = pattern1.matcher(num);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Test one = new Test();
        one.pattern1 = Pattern.compile(NUMBER);

        System.out.println(one.checkNumber("+375(29)771-52-71"));

        //OFFTOP
        String zamena = "1234567890";
        zamena = zamena.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
        System.out.println(zamena);

    }
}
