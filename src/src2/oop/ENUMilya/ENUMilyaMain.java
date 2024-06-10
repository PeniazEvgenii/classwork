package src2.oop.ENUMilya;

import java.util.Scanner;

public class ENUMilyaMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String answer;
        boolean checkInput;

        do {
            System.out.println("Введите цвет");
            answer = console.nextLine();
            checkInput = answer.matches("[A-Za-zА-Яа-я]+");
            if(!checkInput) {
                System.out.println("Введено некорректное слово");
            }
        } while(!checkInput);

        Ecolor ecolor = Ecolor.valueOfIgnoreCase(answer);
        Ecolor ecolor1 = Ecolor.ValueOfRusIgnoreCase(answer);
        System.out.println(ecolor1);


    }


}
