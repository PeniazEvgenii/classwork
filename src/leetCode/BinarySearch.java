package leetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int l = 2147483647;
        System.out.println(isPerfectSquare(l));

    }
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        long ttt = num;

        while(left <= right) {
            int res = (left + right) / 2;
            if ((long) res * res == ttt) return true;
            if ((long) res * res > ttt) {
                right = res - 1;
            } else {
                left = res + 1;
            }
            System.out.println("лево = " + left + " право = " + right);
        }
        return left == right;
    }

}
