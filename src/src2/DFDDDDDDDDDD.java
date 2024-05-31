public class DFDDDDDDDDDD {
    public static void main(String[] args) {
        String s = "fdfdf-dfdf -dddd dfd.;!^&$? -- -";
        String s1 = s.replaceAll("\\p{Punct}", " ");
        System.out.println(s1);
    }
}
