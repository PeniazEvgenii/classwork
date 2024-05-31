package Function.stream.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * [1_000_000] -> age -> max
 *
 * [1_000_000] -> age -> max -> max
 *
 * [1_000_000] -> age  -> max
 */
public class MapReduceExample {
    public static void main(String[] args) {
        List<StudentReduce> listS = new ArrayList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
                for(int i=0; i < 1_000_000;i++) {
            listS.add(new StudentReduce(random.nextInt(10, 100),String.valueOf(random.nextDouble())));
        }
        Optional<StudentReduce> mayBe = listS.stream()
                .filter(student -> student.getAge() < 25)
                //       .map(StudentReduce::getAge)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

        mayBe.ifPresent(System.out::println);
        mayBe.map(StudentReduce::getAge)
                .filter(age -> age > 20)
                . flatMap(age -> Optional.of(age * 10));


    }
}
