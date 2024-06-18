package leetCode;

import java.util.regex.Pattern;

public class NumberOfSegmnts {
    public static void main(String[] args) {
        String s = "    foo    bar";
        System.out.println(countSegments(s));
    }

    public static int countSegments(String s) {
        int count = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (flag != 0) {
                    count++;
                    flag = 0;
                }
            } else {
                flag = 1;
            }
        }
        if (flag == 1) {
            count++;
        }
        return count;
    }
}
