package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IncludeSymbols {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
        int a = -1;
        System.out.println(Integer.toHexString(a));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        int len = magazine.length();
        for (int i = 0; i < len; i++) {
            map.merge(magazine.charAt(i), 1, Integer::sum);
        }
        int len2 = ransomNote.length();
        for (int i = 0; i < len2; i++) {
            Character chari = ransomNote.charAt(i);
            Integer i1 = map.get(chari);
            if(i1 == null || i1 == 0) {
                return false;
            }
            map.put(chari, i1 - 1);
        }
        return true;
    }
}
