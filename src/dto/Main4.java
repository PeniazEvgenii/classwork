package dto;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main4 {
    public static void main(String[] args) {
        //TimeUnit.NANOSECONDS.sleep(1l);
       // TimeUnit.MICROSECONDS.sleep(1L);
        Triangle triangle4 = new Triangle();
        Scanner console = new Scanner(System.in);
        triangle4.a = console.nextInt();
        triangle4.b = console.nextInt();
        triangle4.c = console.nextInt();

    //    double p = (a + b + c )/2.0;
    //    double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
