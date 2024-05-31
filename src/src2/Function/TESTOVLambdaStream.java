package Function;

import Function.practika.PersonStreaam;
import collection.passp.Passport;
import oop.lesson3.Person;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TESTOVLambdaStream {
    public static void main(String[] args) {
        List<PersonStreaam> person = new ArrayList<>();
        PersonStreaam person1 = new PersonStreaam("Ivan", "Ivanov2", 30);
        PersonStreaam person2 = new PersonStreaam("Va", "Ivanov3", 50);
        PersonStreaam person3 = new PersonStreaam("Ekaterina", "Ivanov4", 80);
        PersonStreaam person4 = new PersonStreaam("Anatoldfgdfgii", "Ivanov5", 20);
        PersonStreaam person5 = new PersonStreaam("Evgen", "Ivanov6", 25);
        PersonStreaam person6 = new PersonStreaam("Karol", "Ivanov7", 25);
        PersonStreaam person7 = new PersonStreaam("Petr", "Ivanov8", 11);
        PersonStreaam person8 = new PersonStreaam("Naddfgdfgdfgegda", "Ivanov9", 55);
        PersonStreaam person9 = new PersonStreaam("Ivan", "Ivanov11", 26);
        PersonStreaam person10 = new PersonStreaam("Vasilyi", "Ivanov12", 78);
        PersonStreaam person11 = new PersonStreaam("Sveta", "Svetikova", 20);

        System.out.println(person.add(person1));
        System.out.println(person.add(person2));
        System.out.println(person.add(person3));
        System.out.println(person.add(person4));
        System.out.println(person.add(person5));
        System.out.println(person.add(person6));
        System.out.println(person.add(person7));
        System.out.println(person.add(person8));
        System.out.println(person.add(person9));
        System.out.println(person.add(person10));
        System.out.println(person.add(person11));

        person.stream()
                .collect(Collectors.groupingBy(PersonStreaam::getAge,Collectors.mapping(PersonStreaam::getFullName, Collectors.toList())));

        Map<Integer, List<PersonStreaam>> map = new HashMap<>();


        for (PersonStreaam p : person) {
            map.computeIfAbsent(p.getAge(), k -> new ArrayList<>()).add(p);
        }

        for (Map.Entry<Integer, List<PersonStreaam>> entry : map.entrySet()) {
            System.out.println(entry);
        }


       Map<String, List<Passport>> mapNew1 = new HashMap<>();
       Map<String, List<Passport>> mapNew2 = new HashMap<>();
       Map<String, Passport> map1 = new TreeMap<>(Comparator.comparing(Integer::valueOf));


       ThreadLocalRandom random = ThreadLocalRandom.current();
       for (int i = 0; i < 1_000_000; i++) {
           Passport passport = new Passport(
                   String.valueOf(random.nextInt(1, 1_000_000)),
                   String.valueOf(random.nextDouble(1, 11_000_000)),
                   LocalDate.of(random.nextInt(1900, 2024), random.nextInt(1, 13), random.nextInt(1, 29)),
                   LocalDate.of(random.nextInt(1900, 2024), random.nextInt(1, 13), random.nextInt(1, 29))
           );

           String currentNumber = passport.getNumber();
           map1.putIfAbsent(currentNumber, passport);

           List<Passport> listDoublePassport;
           listDoublePassport = mapNew1.get(currentNumber);
           if(listDoublePassport == null) {
               listDoublePassport = new ArrayList<>();
           }
           listDoublePassport.add(passport);

           mapNew1.put(currentNumber, listDoublePassport);
           mapNew2.computeIfAbsent(currentNumber, k -> new ArrayList<>()).add(passport);
       }

       System.out.println(mapNew1.size());
       System.out.println(map1.size());
       System.out.println(map1);

     //  map1.entrySet().stream().map(Map.Entry::getValue)
     //          .sorted(Comparator.comparing(Passport::getName).thenComparing(Passport::getNumber))
     //          .map(Passport::getNumber)
     //          .map(StringBuilder::new)
     //          .forEach(System.out::println);

int count =0;
       for (Map.Entry<String, List<Passport>> entry : mapNew1.entrySet()) {
           if (entry.getValue().size() >= 8) {
               count++;
               entry.getValue().forEach(System.out::println);
               System.out.println();
           }
       }

        count =0;
        for (Map.Entry<String, List<Passport>> entry : mapNew2.entrySet()) {
            if (entry.getValue().size() >= 8) {
                count++;
                entry.getValue().forEach(System.out::println);
                System.out.println();
            }
        }

        System.out.println(count);
    }

}
