package regulexpression;

import java.util.regex.Pattern;

public class TaskRegularExpressionMail {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        String mail = "kentuchi@mail.org";
        System.out.println(Pattern.matches(regex, mail));

    }
}
