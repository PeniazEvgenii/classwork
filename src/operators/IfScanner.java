package operators;

import java.util.Scanner;

public class IfScanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ты сделал уроки?");
        boolean answer = console.nextBoolean();

        if (answer){    // в if не сравнивать с true!!
            System.out.println("возьми пирожок");
        }

    }
}
