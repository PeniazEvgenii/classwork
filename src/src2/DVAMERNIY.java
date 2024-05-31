import java.util.Random;

public class DVAMERNIY {
    public static void main(String[] args) {
        int[][] dva = new int[10][10];

        Random rand = new Random();
        for (int i = 0; i < dva.length; i++) {
            for (int j = 0; j < dva[i].length; j++) {
                dva[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < dva.length; i++) {
            for (int j = 0; j < dva[i].length; j++) {
                System.out.print(dva[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] i : dva) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
