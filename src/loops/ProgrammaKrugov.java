package loops;

import java.util.Scanner;

public class ProgrammaKrugov {
    private static final int MIN_LAPS_FOR_INPUT = 1;    // не надо непонятных чисел. Лучше переменная. Когда не вводим с клавиатуры
    // объявление и инициализация. Лучше перенести в поле

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int maxLaps;
        boolean checkInputMinLaps;    // чтобы кто-то не мутил с условием
        do {
            System.out.println("Введи кол-во кругов которые надо пробежать");
            //int maxLaps = console.nextInt();
            maxLaps = console.nextInt();
            checkInputMinLaps = maxLaps < MIN_LAPS_FOR_INPUT;
            if(checkInputMinLaps){
                System.out.println("Ошибка введите значение от " + MIN_LAPS_FOR_INPUT + " и выше");
            }
        } while (checkInputMinLaps);     // while за пределами тела и если создали в теле

        System.out.println("Вы ввели " + maxLaps);

        int currentLab = 0;

        while (currentLab < maxLaps) {
            currentLab++;
            System.out.println("Я пробежал " + currentLab + " круг");
        }

        System.out.println("Финиш");


    }
}
