package Function.practika;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5Person15letterOld {
    public static void main(String[] args) {
        List<PersonStreaam> person = List.of(
                new PersonStreaam("Ivan", "Ivanov2", 30),
                new PersonStreaam("Va", "Ivanov3", 50),
                new PersonStreaam("Ekaterina", "Ivanov4", 80),
                new PersonStreaam("Anatoldfgdfgii", "Ivanov5", 20),
                new PersonStreaam("Evgen", "Ivanov6", 25),
                new PersonStreaam("Karol", "Ivanov7", 25),
                new PersonStreaam("Petr", "Ivanov8", 11),
                new PersonStreaam("Naddfgdfgdfgegda", "Ivanov9", 55),
                new PersonStreaam("Ivan", "Ivanov11", 26),
                new PersonStreaam("Vasilyi", "Ivanov12", 78),
                new PersonStreaam("Sveta", "Svetikova", 20)
                );

        person.stream()
                .filter(chel -> (chel.getFirstName() + chel.getLastName()).length() < 15)
                .max((person1, person2) -> Math.max(person1.getAge(), person2.getAge()))
                .ifPresent(System.out::println);

        person.stream()
                .filter(chel -> (chel.getFirstName() + chel.getLastName()).length() < 15)
                .max(Comparator.comparing(PersonStreaam::getAge))
                .map(PersonStreaam::getLastName)
                .ifPresent(System.out::println);


        Map<Integer, List<String>> collect = person.stream()
                .collect(Collectors.groupingBy(PersonStreaam::getAge,
                        Collectors.mapping(PersonStreaam::getLastName, Collectors.toList())));

        for (Map.Entry<Integer, List<String>> integerListEntry : collect.entrySet()) {
            System.out.println(integerListEntry);
        }

  //     String[] array = {"Java", "Ruuuuussshhh"};
  //     Stream<String> streamOfArray = Arrays.stream(array);
  //     streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
  //              .flatMap(Arrays::stream)//.distinct() //выравнивает каждый сгенерированный поток в один поток
  //             .collect(Collectors.toList()).forEach(System.out::println);



    }
}
