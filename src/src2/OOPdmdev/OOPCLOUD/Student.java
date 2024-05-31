package OOPdmdev.OOPCLOUD;

import oopILYA.extend.dto.Phonee;

public class Student {
    public static final int MAX_STIP_STUDENTA = 2000;
    public static final int MIN_STIP_STUDENTA = 1900;
    public static int id;
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        id++;
    }

    public double getScholarship() {
        if (averageMark == 5.0){
            return MAX_STIP_STUDENTA;
        }
            return MIN_STIP_STUDENTA;
    }

    public void printStudent() {
        System.out.println(firstName + " " + lastName + ", группа № " + group + ". Средняя оценика = " + averageMark + ". Выплатить стипенидии - " + getScholarship());
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
