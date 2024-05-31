package Exception;

/**
 * бросить одно из существующих исключений, отолвить и в качкствк причигы
 * указать
 */
public class Task5_Exeption {
    public static void main(String[] args) throws DmdevException {
        try {
            catchCustomException();
        } catch (DmdevException exception) {
            System.out.println("Catch in main");
            exception.printStackTrace();
        }

    }

    public static  void catchCustomException(){
        try {
            unsafe2();
        } catch (RuntimeException exception) {
            System.out.println("Catch in catchCustomException");
            throw new DmdevException(exception);
        }
    }
    public static void unsafe2() {
        throw new RuntimeException("Ooops");
    }
}
