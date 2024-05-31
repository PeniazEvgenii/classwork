package oop.lesson3;

public class Person {
    private String fio;
    private int age;
    private int weight;
    private int numberLevel;

    public Person(String fio, int age, int weight, int numberLevel) {
        this.fio = fio;
        this.age = age;
        this.weight = weight;
        this.numberLevel = numberLevel;
    }

    public String getFio() {
        return fio;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public int getNumberLevel() {
        return numberLevel;
    }

    public boolean checkInputFio (String s) {
        return s.matches("[a-zA-z\\s-]+");
    }

    public void setInform(String fio, int age, int weight, int numberLevel) {
        if(checkInputFio(fio) && (age >= 30 && age <=200) && (numberLevel>=0 && numberLevel<=5)){
            this.fio = fio;
            this.age = age;
            this.weight = weight;
            this.numberLevel = numberLevel;
        }
    }
}

class Hz{
    public static void main(String[] args) {
        Person chel = new Person("AZM", 50, 80, 4);
        System.out.println(chel.getFio() + " " + chel.getAge() + " " + chel.getWeight() + " " + chel.getNumberLevel());
        chel.setInform("A Z B",50, 400, 4);
        System.out.println(chel.getFio() + " " + chel.getAge() + " " + chel.getWeight() + " " + chel.getNumberLevel());
    }
}
class Arhiv{
    public static void main(String[] args) {
        Person arh[] = new Person[50];
        arh[0] = new Person("AZM", 50, 80, 4);
        arh[1] = new Person("AAA", 50, 80, 4);
        arh[2] = new Person("LLL", 50, 80, 4);
        arh[3] = new Person("ZZZ", 50, 80, 4);
        arh[4] = new Person("XXX", 50, 80, 4);
        arh[5] = new Person("BBB", 50, 80, 4);

        for (int i = 0; i < 6; i++) {
            System.out.println(arh[i].getFio());
        }
    }
}

