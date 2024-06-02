package generic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = 0;
        boolean error;
        do {
            error = false;
            System.out.println("ВВеди число int");

            try {
                a = console.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введено неверное число");
                error = true;
                console = new Scanner(System.in);
            }

        } while (error);

        System.out.println(a);


    }
}
