package loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class msssive {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();

        //двумерный массив
        int[][] test = {{1,2,3,4,5,6,7,8,9}, {9,8,7,6,5,4,3,2,1}};

        int[][] arrayTwo = new int[10][10];

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(" " + test[i][j] + " ");
            }
            System.out.println();

        }



    }
}
