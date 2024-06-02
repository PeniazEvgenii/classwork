package generic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SETset {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");
        set1.add("100");
        set1.add("9");
String p = "";
        for (String s : set1) {
            p += s;
        }
        System.out.println(p);
        Set<String> set2 = new LinkedHashSet<>(); // сохраняет порядок ввода

        p = "";
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            p += iter.next();
        }
        System.out.println(p);
    }

}
