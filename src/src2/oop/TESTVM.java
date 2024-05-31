package oop;

public class TESTVM {
    public static void main(String[] args) {
        int[] str = new int[4_000_000_0];
        int[] str2 = new int[4_000_000_0];

        for (int i = 0; i < str.length; i++) {
            str[i] = i;
            str2[i] = i;
            System.out.println(str[i] + str2[i]);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + " " + str2[i]);
        }

    }
}
