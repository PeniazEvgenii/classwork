package leetCode;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char left = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = left;
        }
    }
}
