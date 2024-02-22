package operators;

public class Main1 {
    public static void main(String[] args) {
        int myAge = 30;

        myAge +=1;                   // сокращенный оператор
        System.out.println(myAge);
        System.out.println(Constant.m);
        int a = 10;
        int b = ++a;
        int c = a++; //a=12
        int d = a++ + a;
        int z = a++ + ++a;  // a++ сначала поставляется а но потом увеличивается
        System.out.println(d + " "+z);

    /*
        int a = 10;
        int b = 3;
        double result = a/b;      // !!!Целочисленный делиться на целочисленный!!!
        System.out.println(result);
    */
        /*
        int a = 10;
        double b = 3;
        double result = a/b;      // !!! целочисленный делиться на Дробный!!!
        System.out.println(result);
        */
        /*
        int a = 10;
        int b = 3;
        double result = a*1.0/b;      // !!! левый операнд стал Дробный!!!
        System.out.println(result);
        */
        /*
        int a = 2_147_483_647;
        long result = a + 10;    // но если указать 10L,  либо умножить на 1L
        System.out.println(result);
        */

        




    }
}
