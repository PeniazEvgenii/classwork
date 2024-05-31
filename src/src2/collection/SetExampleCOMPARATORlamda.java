package collection;



import java.util.*;

public class SetExampleCOMPARATORlamda {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("caa");
        set.add("bbb");
        set.add("cec");
        set.add("acc");
        set.add("ycc");
        set.add("kcc");
        System.out.println(set.add("aaa"));
        System.out.println(set);

   //    for (String s : set) {
   //        System.out.println(s);
   //    }
   //    Comparator<Person> personComparator =  (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
   //    Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName);

        NavigableSet<Integer> times = new TreeSet<>();
        times.add(1205);
        System.out.println(times.add(1505));
        System.out.println(times.add(1545));
        System.out.println(times.add(1830));
        System.out.println(times.add(2010));
        System.out.println(times.add(2100));

        SortedSet subset = times.headSet(1600);
        System.out.println(subset);
        System.out.println(subset.last());
        SortedSet subset1 = times.tailSet(2000);
        System.out.println(subset1);
        System.out.println(subset1.first());

        System.out.println(times.higher(1923));
        System.out.println(times.lower(1600));

    }
}
