package loops;

import java.util.Scanner;

public class ProgrKrugovRepeat {

    private static final int MIN_LAPS_FOR_INPUT = 0;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введи количество кругов");

        int maxLaps;
        boolean checkInputMinLaps;
        do {
            maxLaps = console.nextInt();
            checkInputMinLaps = maxLaps < MIN_LAPS_FOR_INPUT;
            if (checkInputMinLaps) {
                System.out.println("Неверное значение. Введи от 0 и больше");
            }
        } while (checkInputMinLaps);

        System.out.println(maxLaps);

        int currentLap = 0;
        while (maxLaps-- > 0) {
            System.out.println("Осталось " + maxLaps + " круга" );
        }
        System.out.println();
    }
}
