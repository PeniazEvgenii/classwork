package leetCode;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }
    public static String licenseKeyFormatting(String s, int k) {
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        s = s.toUpperCase();
        for (int i = length - 1; i >= 0; i--) {
            if(s.charAt(i) == '-') {
                continue;
            }
            if(count % k == 0 && count != 0) {
                stringBuilder.insert(0,"-");
            }
            stringBuilder.insert(0,s.charAt(i));
            count++;
        }
        return stringBuilder.toString();
    }
}
