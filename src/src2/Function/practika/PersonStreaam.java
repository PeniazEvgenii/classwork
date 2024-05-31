package Function.practika;

import java.util.Objects;

public class PersonStreaam {
    private final String firstName;
    private final String LastName;
    private final int age;

    public PersonStreaam(String firstName, String lastName, int age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFullName(){
        return getFirstName() + getLastName();
    }

    @Override
    public String toString() {
        return "TestPersonStream{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonStreaam that = (PersonStreaam) o;
        return age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(LastName, that.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName, age);
    }
}
