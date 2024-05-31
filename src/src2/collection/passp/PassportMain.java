package collection.passp;

import java.sql.Time;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class PassportMain {
    public static void main(String[] args) throws InterruptedException {
        Map<String, List<Passport>> data = new TreeMap<>(new ComparatorLength());
        ArrayList<Passport> list = new ArrayList<>();

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 1_000_000; i++) {
            Passport passport = new Passport(
                    String.valueOf(random.nextInt(1,1_000_000)),
                    String.valueOf(random.nextDouble(1,11_000_000)),
                    LocalDate.of(random.nextInt(1900,2024), random.nextInt(1,13), random.nextInt(1, 29)),
                    LocalDate.of(random.nextInt(1900,2024), random.nextInt(1,13), random.nextInt(1, 29))
            );
            list.add(passport);
            String checkNumber = passport.getNumber();

            List<Passport> listP = data.get(checkNumber);
            if(listP == null) {
                listP = new ArrayList<>();
            }
            listP.add(passport);
            data.put(checkNumber,listP);
        }
        System.out.println(data);
        //TimeUnit.SECONDS.sleep(10);

        int count = 0;
        for (Map.Entry<String, List<Passport>> entry : data.entrySet()) {
            if(entry.getValue().size() >= 2) {
               // System.out.println(entry);
                count++;
            }
        }

        Collections.sort(list);
       // System.out.println(list);
        System.out.println(data.size());
        System.out.println(count);
    }
}
