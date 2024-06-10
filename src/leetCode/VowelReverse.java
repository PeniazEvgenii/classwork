package leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VowelReverse {
    public static void main(String[] args) {
        System.out.println(reverseVowels("ea"));
    }

    public static String reverseVowels(String s) {
        char[] vowel = {'a', 'e', 'o', 'i', 'u'};
        String vow = "aeoiuAEOIU";

        int length = s.length();

        int left = 0;
        int right = length - 1;
        char[] charArray = s.toCharArray();


        while(true) {

            while(left < right && vow.indexOf(charArray[left]) == -1) {
                left++;
            }

            while (left < right && vow.indexOf(charArray[right]) == -1) {
                right--;
            }

            if(left > right) {
                break;
            } else {
                char temp = charArray[left];
                System.out.println(charArray[left]);
                System.out.println(charArray[right]);
                charArray[left] = charArray[right];
                charArray[right] = temp;
                System.out.println(charArray[right]);

            }
            right--;
            left++;

        }

        return new String(charArray);
    }
}
