package leetCode;

import java.util.Arrays;

public class ConvertString {
    public static void main(String[] args) {
        System.out.println(addStrings("111", "111"));
    }
    public static String addStrings(String num1, String num2) {
        int zero = 48;
        char[] charArray1 = num1.toCharArray();
        char[] charArray2 = num2.toCharArray();
        long count = 0;

        for (int i = 0; i < charArray1.length; i++) {
            count = (charArray1[i] - zero) + count * 10;
        }
        long result = count;
        count = 0;
        for (int i = 0; i < charArray2.length; i++) {
            count = (charArray2[i] - zero) + count * 10;
        }
        return String.valueOf(result + count);
    }
}
