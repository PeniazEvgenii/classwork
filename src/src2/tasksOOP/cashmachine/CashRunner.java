package tasksOOP.cashmachine;

import tasksOOP.cashmachine.api.INote;
import tasksOOP.cashmachine.notes.*;

import java.util.Arrays;
import java.util.Scanner;

public class CashRunner {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine("БЕЛАРУСБАНК\nБАНКОМАТ №25");

        cashMachine.addNoteInATM(new Note(50), 100);
//        cashMachine.addNoteInATM(new Note(100), 1);
//        cashMachine.addNoteInATM(new Note(500), 1);
        cashMachine.addNoteInATM(new Note(1000), 5);
//        cashMachine.addNoteInATM(new Note(5000), 1);

        System.out.println(cashMachine.getAvailableNote());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия");
        int amount = scanner.nextInt();

        INote[] resultArray = cashMachine.takeNotes(amount);
        Check check = cashMachine.getCheck(amount);

        System.out.println(Arrays.toString(resultArray));
        System.out.println(check.toString());

        System.out.println(cashMachine.getAvailableNote());


    }
}
