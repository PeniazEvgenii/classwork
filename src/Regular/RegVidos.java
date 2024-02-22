package Regular;

import javax.sound.midi.Soundbank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegVidos {

    public static final String text = "Тайланд - красивая страна." +
     " Многие люди посещают Тайланд каждый год";

    public static boolean test (String s){
        Pattern p = Pattern.compile("^Ivan$");     // создали правило
        Matcher m = p.matcher(s);                        // применили правило к формальному параметру
        return m.matches();                              // вернули результат сооств сроки с правилом
    }

    public static boolean test2 (String s){
        Pattern pattern = Pattern.compile(".+\\.(com|ru|org)");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
       // System.out.println(test("Ivan"));
      // System.out.println(test("ivan"));
      // System.out.println(test("Ivann"));
      // System.out.println(test("IIvan"));
      // System.out.println(text.replaceAll("[тТ]а[ий]ланд", "Россия"));
      // System.out.println(text);             // replaceAll в печати без присвоения не меняет строку

       System.out.println(test2("site.ru")); // проверка домена сайта




        System.out.println("0123456789".replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1)$2-$3"));
    }
}
