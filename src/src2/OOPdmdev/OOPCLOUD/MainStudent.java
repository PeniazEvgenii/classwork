package OOPdmdev.OOPCLOUD;

public class MainStudent {
    public static void main(String[] args) {

        Student[] student = new Student[12];
        student[0] = new Student("ВАСЯ", "ПУПКИН","11B",5);
        student[1] = new Student("ВА", "ПУП","11B",5);
        student[2] = new Student("СЯ", "КИН","11B",3);
        student[3] = new Student("RАСЯ", "ПУШКИН","11B",4);
        student[4] = new Student("ВЛОХ", "ПУПКИН","11B",4.9);
        student[5] = new Student("Боря", "ПУПКИН","11B",5);
        student[6] = new Aspirant("ANTON", "ANTONE","101519A",5);
        student[7] = new Aspirant("PETYA", "SHANDONG","101519A",4);
        student[8] = new Aspirant("EVG", "MENTION","101519A",3);
        student[9] = new Aspirant("SERGE", "CANTON","101519A",2);
        student[10] = new Aspirant("KATE", "NON","101519A",5);
        student[11] = new Aspirant("ADOLF", "NE","101519A",4.8);
        System.out.println(Student.id);
        printStudent(student);
    }
   public static void printStudent(Student[] students) {
       for (int i = 0; i < students.length; i++) {
           students[i].printStudent();
       }
   }
}
