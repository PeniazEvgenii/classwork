package leetCode;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }
    public static int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while (n >= 0) {
            n = n - i;
            if(n >= 0) {
                count++;
                i++;
            }
        }
        //for test
        return count;
    }
}
