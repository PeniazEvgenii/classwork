package generic.collection.dto;

import generic.collection.Passport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class PassportMain {
    public static void main(String[] args) {
        Map<String,List<Passport>> data = new HashMap<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < 1_000_000; i++) {
            Passport passport = new Passport(
                    String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextDouble(1,1000_000)),
                    LocalDate.of(rnd.nextInt(1990,2024), rnd.nextInt(1,13),
                            rnd.nextInt(1,28)),
                    LocalDate.of(rnd.nextInt(1990,2024), rnd.nextInt(1,13),
                            rnd.nextInt(1,28))
            );


            List<Passport> nameAll = data.get(passport.getNumber());

            if(nameAll == null){
                nameAll = new ArrayList<>();
            }
            nameAll.add(passport);
            data.put(passport.getNumber(), nameAll);
        }
        System.out.println(data.size());
        for (List<Passport> value : data.values()) {
            if(value.size()>1) {
                System.out.println(value);
            }
        }
    }
}
