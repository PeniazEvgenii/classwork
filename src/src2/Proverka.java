import java.util.Scanner;

public class Proverka {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи число");
        if (console.hasNextByte()) {
            int a = console.nextByte();
            System.out.println("Число a = " + a);
        } else {
            System.out.println("Вы ввели неверное число. Введите в диапозоне от - 128 до 127");
            int a = console.nextByte();
        }
    }
}
