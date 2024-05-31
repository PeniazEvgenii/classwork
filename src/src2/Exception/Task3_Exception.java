package Exception;

/**
 * 3 создать собственный класс-исключеник - наследник Exception.
 *           создать метод выбрасываюхий это исключение
 *           вызватть метод и отловить исключение. вывести stack trace
 */

public class Task3_Exception {
    public static void main(String[] args) {
        try {
            unsafe1();
        } catch (Exception exception) {
            System.err.println("caatrch start");
            System.out.println(exception.getCause());
            exception.printStackTrace();
            System.err.println("caatrch end");
        }
    }

    public static void unsafe1() throws DmdevException{
        throw new DmdevException(new NullPointerException("runTimeExcpt"));
    }
}
