package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FindDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("aabbccddeuillmmooppprts",
                "aabbccddeuillmmoopppqrts"));
    }
    public static char findTheDifference(String s, String t) {
        char base = 'a';
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
           int temp1 = s.charAt(i) - base;
            count[s.charAt(i) - base]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int temp1 = t.charAt(i) - base;
            count[t.charAt(i) - base]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return (char)(base + i);
            }
        }
        throw new IllegalArgumentException();
    }
}
