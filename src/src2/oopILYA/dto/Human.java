package oopILYA.dto;

public class Human implements IHuman{




    /**
     * колличество зубов
     */
    protected int teethCount;

    /**
     * поле имя
     */
    protected String name;
    /**
     * поле возраст
     */
    protected int age;

    /**
     * метод получения имени (getter)
     * @return имя в виде строки
     */
    public String getName() {
        return name;
    }

    /**
     * Метод изменения имени
     * @param name - имя которое мы хотим установить
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение возраста человека
     * @return текущий возраст человека
     */
    public int getAge() {
        return age;
    }
    /**
     * Метод для изменения возраста
     * @param age - возраст, которое мы хотим установить
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Получение количества зубов
     * @return количество зубов
     */
    public int getTeethCount() {
        return teethCount;
    }


    /**
     * Метод для изменения количества зубов
     * @param teethCount - количество зубов, которое мы хотим создать
     */
    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }
}
