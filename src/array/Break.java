package array;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int start;
        do {
            System.out.println("Введи начальное значение");
            start = console.nextInt();
            if (start < 1){
                System.out.println("неверное значение");
            }
        }
        while (start <1);

        System.out.println("Введи конечное значение");
        int finish = console.nextInt();


        int currentStep = start;         // не портим start
        int result = -1; // хранит найденное число

        while (currentStep <= finish) {
            if (currentStep % 13 == 0) {
                result = currentStep;
                break;
            }
            currentStep++;
        }

        System.out.println("First number is: " + result);
    }
}
