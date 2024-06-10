package leetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {

        int length = t.length();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.computeIfAbsent(t.charAt(i),k -> new ArrayList<>()).add(i);
        }
      //  System.out.println(map);
        int current = 0;
        int prev = -1;

        for (int i = 0; i < s.length(); i++) {
            List<Integer> list = map.get(s.charAt(i));
            if (list == null) {
                return false;
            }
          //  System.out.println(list);
            current = prev;
            for (Integer integer : list) {
                if(integer > prev) {
                    prev = integer;
          //          System.out.println(prev);
                    break;
                }
            }
            if(current == prev) return false;

        }
        return true;

    }
}

class TestOfSubsequence {
    @Test
    public void isSubsequenceTest(){
        assertTrue(IsSubsequence.isSubsequence("ba", "abbaa"));

    }
}