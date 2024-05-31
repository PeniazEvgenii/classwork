package Time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Task4LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate2 = LocalDate.of(2018,07,07);
        System.out.println(localDate2);
        System.out.println(ChronoUnit.DAYS.between(localDate2, localDate));
        LocalTime r = LocalTime.now();
    }
}
