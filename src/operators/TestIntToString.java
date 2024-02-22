package operators;

public class TestIntToString {
    public static void main(String[] args) {
        String str = "   123 ";
        int a = Integer.parseInt(str.trim());
        System.out.println(a);
        String str1 = Integer.toString(a);
        System.out.println(str1);
        Integer ii = new Integer(5);
        ii = Integer.valueOf(str1+11);
        System.out.println(ii);
        String str2 = ii.toString();
        System.out.println(str2);
        int ne = 125;
        String s = Integer.toBinaryString(ne);
        s = String.format("%8s",s);
        int cc = s.indexOf("0");
        System.out.println(cc);
        System.out.println(s);

    }
}
