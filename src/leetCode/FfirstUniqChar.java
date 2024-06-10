package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FfirstUniqChar {
    public static void main(String[] args) {
      String  s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
//        int length = s.length();
//        for (int i = 0; i < length; i++) {
//            char temp = s.charAt(i);
//            if(s.indexOf(temp) == s.lastIndexOf(temp)) {
//                return i;
//            }
//        }
//        return -1;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
           map.merge(s.charAt(i), 1, Integer::sum);
        }
        System.out.println(map);
        for (int i = 0; i < length; i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
