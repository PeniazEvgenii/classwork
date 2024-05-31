package Time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.zip.DataFormatException;

import static java.time.temporal.ChronoField.YEAR;

public class TimeTime {
    static Clock clock  = Clock.systemDefaultZone();
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
        ZonedDateTime a = ZonedDateTime.now();
        System.out.println(a.truncatedTo(ChronoUnit.DAYS));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime localDateTime2 = localDateTime1.plusMonths(3);

        System.out.println(localDateTime.format(formatter));
        System.out.println(localDateTime2.format(formatter));

        System.out.println(localDateTime2.toLocalDate());
        System.out.println(localDateTime2.toLocalTime());

        //////////////////////////////////////////////////

        LocalDate nowDate = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(nowDate.format(formatter1));

        /////////////////////////////////////////////////

        String str = "26-03-1968T09:24";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyy'T'HH:mm");
        LocalDateTime localDateTime3 = LocalDateTime.parse(str, formatter2);
        System.out.println(localDateTime3);
        ///////////////////////////////////////////////////
        Instant instant = localDateTime3.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime3));
        System.out.println(instant);

    }
}
