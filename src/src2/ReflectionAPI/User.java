package ReflectionAPI;

import java.io.Serializable;

@MinAge(age = 21)
@MaxAge(description = 60)
public class User extends Person implements Serializable, Comparable<User> {

    private String name;

    @MaxAge(description = 60)
    @MinAge(age = 21)
    private int age;

    public User(long id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}' + super.toString();
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
