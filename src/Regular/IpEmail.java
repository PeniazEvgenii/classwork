package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpEmail {

    private Pattern pattern, pattern2; // создали 2 объекта класса Pattern email и ip
    private Matcher matcher; // сделали matcher для применения правила к строке
    private static final String EMAIL_PATTERN = "^[A-Za-z_0-9-\\.]+@[a-zA-Z-]+\\.[a-zA-Z0-9]+$";

    private static final String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25(0-5))\\." +
                                              "([01]?\\d\\d?|2[0-4]\\d|25(0-5))\\." +
                                              "([01]?\\d\\d?|2[0-4]\\d|25(0-5))\\." +
                                              "([01]?\\d\\d?|2[0-4]\\d|25(0-5))$";

    public IpEmail() {
        pattern = Pattern.compile(EMAIL_PATTERN); // в конструкторе откомпилировали правило
        pattern2 = Pattern.compile(IP_PATTERN);
    }

    boolean checkEmail (String s){
        matcher = pattern.matcher(s);
        return matcher.matches();
    }

    boolean checkIp (String s) {
        matcher = pattern2.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        IpEmail d = new IpEmail();
        System.out.println(d.checkEmail("evgenii.Peniaz@mail.ru"));
        System.out.println(d.checkIp("15.115.15.100"));
    }
}
