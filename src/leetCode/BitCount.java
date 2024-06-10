package leetCode;

import java.util.Arrays;

public class BitCount {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(20)));
    }
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String binaryString = Integer.toBinaryString(i);
            long parseInt = Long.parseLong(binaryString);
            long sum = 0;
            while (parseInt > 0) {
                sum += parseInt % 10;
                parseInt /= 10;
            }
            result[i] = (int) sum;
            sum = 0;
        }


        return result;
    }
}
