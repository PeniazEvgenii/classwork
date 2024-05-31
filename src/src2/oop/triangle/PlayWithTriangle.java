package oop.triangle;

import java.util.Scanner;

public class PlayWithTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи количество треугольников");
        int value = console.nextInt(); //
        int[] a = new int[value];
        int[] b = new int[value];
        int[] c = new int[value];

        for (int i = 0; i < value; i++) {
            System.out.println("Введи сторону A треугольника № " + (i + 1));
            a[i] = console.nextInt();
            System.out.println("Введи сторону B треугольника № " + (i + 1));
            b[i] = console.nextInt();
            System.out.println("Введи сторону C треугольника № " + (i + 1));
            c[i] = console.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("[%d] - a = %d, b = %d, c = %d%n", (i+1), a[i], b[i], c[i]);
        }


    }
}
