package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    private Pattern patternIp, patternEmail, patternNumber;
    private Matcher matcher;

    private static final String IP_PATTERN = "^(([01]?\\d\\d?|2[0-4]\\d|25(0-5))\\.){3}([01]?\\d\\d?|2[0-4]\\d|25(0-5))";
    private static final String EMAIL_PATTERN = "[a-zA-Z_0-9\\.-]+@[a-zA-Z]+\\.[a-zA-z]+";
    private static final String NUMBER_PATTERN = "\\+375(29|44|33|25)\\d{3}([-\\s]?\\d{2}){2}";

    public boolean checkIp (String s) {
        matcher = patternIp.matcher(s);
        return matcher.matches();
    }

    public boolean checkEmail (String s) {
        matcher = patternEmail.matcher(s);
        return matcher.matches();
    }

    public boolean checkNumber (String s) {
        matcher = patternNumber.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Test1 one = new Test1();
        one.patternIp = Pattern.compile(IP_PATTERN);          // тк переменные паттерн не статичные то нужно создавать объект
        one.patternEmail = Pattern.compile(EMAIL_PATTERN);
        one.patternNumber = Pattern.compile(NUMBER_PATTERN);


        System.out.println(one.checkIp("192.249.88.1"));
        System.out.println(one.checkEmail("evgeniipeniAz@mail.ru"));
        System.out.println(one.checkNumber("+375297715271"));
    }
}
