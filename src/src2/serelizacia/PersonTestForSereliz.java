package serelizacia;

import java.io.Serializable;
import java.util.Objects;

public class PersonTestForSereliz implements Serializable {
    private static final long serialVersionUID = 3063548741513609563L;
    private String name;
    private int age;
    private String work;

    public PersonTestForSereliz(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    @Override
    public String toString() {
        return "PersonTestForSereliz{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTestForSereliz that = (PersonTestForSereliz) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(work, that.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, work);
    }
}
