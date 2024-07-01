package leetCode;

public class RepeatSubstring {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {

        for (int i = 2; i <= s.length(); i++) {
            if (s.length() % i != 0) {
                continue;
            }
            String temp = s.substring(0, s.length() / i);
            int flag = 1;

            int count = 0;
            for (int j = 0; j < i; j++) {
                if(s.substring(temp.length() * j, temp.length() * (j+1)).equals(temp)) {
                    count++;
                }
            }
            if(count == i) return true;
        }
        return false;
    }
}
