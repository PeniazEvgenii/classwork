package regulexpression.regulexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTAGregexp {
    public static void main(String[] args) {
        String regexp = "(<p.+?>)(.+?</p>)";
        Pattern pattern = Pattern.compile(regexp);
        String tag = "<p>asas asasas </p> <p id =\"p1\">dsd</p> <ff>";
        Matcher matcher = pattern.matcher(tag);
        System.out.println(tag.replaceAll(regexp, "<p>$2"));
    }
}
