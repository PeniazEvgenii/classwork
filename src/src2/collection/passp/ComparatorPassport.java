package collection.passp;

import java.util.Comparator;

public class ComparatorPassport implements Comparator<Passport> {
    @Override
    public int compare(Passport o1, Passport o2) {
       return o2.getName().compareTo(o1.getName());
    }
}
