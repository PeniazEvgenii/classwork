package PRIKOLNO;

public class SqureRoot {
    public static double getSquareRoot(double x) {
        if (x < 0) {
            return -1;
        }
        double a = x;
        while (true) {
            double temp = (x / a + a) / 2;
            if(Math.abs(a - temp) < 1e-15) {
                return a;
            } else {
                a = temp;
            }
        }
    }
}
