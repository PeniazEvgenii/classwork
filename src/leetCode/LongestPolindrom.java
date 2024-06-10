package leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPolindrom {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        int count = 0;
        for (Integer value : map.values()) {
            count += value / 2 * 2;
        }
        if(count < s.length()) {
            ++count;
        }
        return count;
    }
}

class TestPolindrom {
    @Test
    public void longPolindromTest() {
        int i = LongestPolindrom.longestPalindrome("a");
        Assertions.assertEquals(1,i);

        int i2 = LongestPolindrom.longestPalindrome("bb");
        Assertions.assertEquals(2,i2);

        int i1 = LongestPolindrom.longestPalindrome("abccccdd");
        Assertions.assertEquals(7,i1);
    }
}
