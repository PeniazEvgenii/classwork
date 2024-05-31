package collection.passp;

import java.time.LocalDate;
import java.util.Objects;

public class Passport implements Comparable<Passport>{
    private String number;
    private String name;
    private LocalDate BirtDate;
    private  LocalDate issuanceDate;

    public Passport(String number, String name, LocalDate birtDate, LocalDate issuanceDate) {
        this.number = number;
        this.name = name;
        BirtDate = birtDate;
        this.issuanceDate = issuanceDate;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirtDate() {
        return BirtDate;
    }

    public LocalDate getIssuanceDate() {
        return issuanceDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", BirtDate=" + BirtDate +
                ", issuanceDate=" + issuanceDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


    @Override
    public int compareTo(Passport o) {
        return number.compareTo(o.getNumber());
    }
}
