package Function.stream.reduce;

public class StudentReduce {
    private int age;
    private String  name;

    public StudentReduce(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentReduce{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
