package leetCode;

import java.util.HashMap;
import java.util.Map;

public class ConstructRectangular {
    public static void main(String[] args) {
        int[] ints = constructRectangle(20);
        for (int i : ints) {
            System.out.println(i);
        }
    }
    public static int[] constructRectangle(int area) {
        int side = 0;
        int min = area;
        for (int i = 1; i <= area; i++) {
            if(area % i != 0) {
                continue;
            }
            int subtruction = Math.abs( area / i - i );
            if(subtruction < min) {
                side = i;
                min = subtruction;

            }
        }
        int length = Math.max(side, area / side);
        return new int[] {length, area / length};
    }
}
