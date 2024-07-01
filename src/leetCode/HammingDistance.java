package leetCode;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1234, 1686));
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                count++;
            }
            System.out.println(x + "  " + y);
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
