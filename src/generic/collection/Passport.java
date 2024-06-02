package generic.collection;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    String number;
    String name;

    LocalDate BirthDate;
    LocalDate issuanceDate;

    public Passport(String number,String name,  LocalDate birthDate, LocalDate issuanceDate) {
        this.name = name;
        this.number = number;
        BirthDate = birthDate;
        this.issuanceDate = issuanceDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public LocalDate getIssuanceDate() {
        return issuanceDate;
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
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", BirthDate=" + BirthDate +
                ", issuanceDate=" + issuanceDate +
                '}';
    }
}
