package regulexpression.regulexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test101regex {
}

    class Example {
         public static void main(String[] args) {
            final String regex = "\\bп.*?(в)(е)т";
            final String string = "привет привет привет дядьк ваыва привет ывоалыва привет Петоровияпривет ken_tuc-hi1991@mail.ru";

             final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
             final Matcher matcher = pattern.matcher(string);
             //System.out.println(matcher.group());


             while (matcher.find()) {
               System.out.println("Full match: " + matcher.group(0));

               for (int i = 1; i <= matcher.groupCount(); i++) {
                     System.out.println("Group " + i + ": " + matcher.group(i));
               }
           }
     }
}
