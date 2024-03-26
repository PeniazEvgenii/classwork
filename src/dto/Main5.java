package dto;

import java.util.Scanner;
public class Main5 {
   public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ВВеди количество треугольников");
        int count = console.nextInt();

        int[] sideA = new int[count];
        int[] sideB = new int[count];
        int[] sideC = new int[count];

        for (int i = 0; i < count; i++) {

        }


  //
  //     int[] triangle1 = storony();
  //     int[] triangle2 = storony();
  //     int[] triangle3 = storony();



    }

    public static int[] storony() {
        int[] treyg = new int[3];

        for (int i = 0; i < treyg.length; i++) {
            System.out.println("ВВеди сторону треугольника");
            treyg[i] = console.nextInt();
        }

        return treyg;
    }
}
