package String;

public class StringBUFFF {
    public static void main(String[] args) {
        String str = "ПРивет Дядя Вася как дела";
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append("!");
        stringBuffer.delete(0,2);
        stringBuffer.reverse();

        System.out.println(stringBuffer.length()); // длина стринг баффера
        System.out.println(stringBuffer.capacity()); // объем выделенной памяти


        System.out.println(stringBuffer);

        int x = 20;
        StringBuffer stringBuffer1 = new StringBuffer();
        do {
            stringBuffer1.append((x & 1) == 0 ? 0 : 1);
            x >>>= 1;
        } while ( x!= 0);
        System.out.println (stringBuffer1.reverse().toString());

        int c = 20;
        System.out.println(toBinary(c));
    }

    public static String toBinary (int x) {
        StringBuffer stringBuffer = new StringBuffer();
        while (x > 1) {
            stringBuffer.append(x % 2);
            x /= 2;
        }
        stringBuffer.append(x).reverse();
        return stringBuffer.toString();
    }
}
