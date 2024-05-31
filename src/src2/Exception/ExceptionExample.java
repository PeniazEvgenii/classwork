package Exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
           unsafe(-10);
       } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");

        int[] array = new int[2];
        try {
            array[2] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        array[0] = 1;
        System.out.println(array[0]);
        System.out.println(array[1]);

        System.out.println(finallyTest());
    }

    public static int finallyTest() {
        try {
            return 2;
        } catch (Throwable throwable){
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("unsafe start");
        if(value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
    }
}
