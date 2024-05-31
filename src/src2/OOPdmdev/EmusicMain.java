package OOPdmdev;

import java.util.Scanner;

public class EmusicMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String answer;
        boolean checkInput;

        do {
            System.out.println("введите музыку");
            answer = console.nextLine();
            checkInput = answer.matches("[a-zA-Zа-яА-я]+");
            if(!checkInput) {
                System.out.println("Введено невеное значение");
            }

        } while(!checkInput);
        Emusic mc = Emusic.checkName(answer);
        System.out.println(mc);
    }
}
