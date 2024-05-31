package Function.lambda;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t >= 0;
        System.out.println(predicate.test(-10));

        Predicate<String> predStr = s -> s == null;
        Predicate<String> predStr1 = Objects::isNull;

        System.out.println(predStr.test(null));
        System.out.println(predStr.test("привет"));

        Predicate<String> predStr3 = s -> s.isEmpty();
        Predicate<String> predStr4 = String::isEmpty;

        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("AB"));

        System.out.println("тест начала проверки строки и конца");
        Predicate<String> testovStr = str -> str.matches("[JN].*A");
        System.out.println(testovStr.test("JamesA"));
        System.out.println(testovStr.test("NamesA"));
        System.out.println(testovStr.test("amesA"));
        System.out.println(testovStr.test("NamesAB"));

    }
}
