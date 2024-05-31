package Exception;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * создать метод случайным образом выбрасывающий одно из 3 видов исключ
 * вызвать в блоке try-catch метод , отлавливающий любое из трех исклбчений
 */
public class Task6_Exception {
    private static final Map<Integer,Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not find exception"),
            2, new IndexOutOfBoundsException("index exception"));
    public static void main(String[] args) {
        Random random = new Random();

        try {
            unsafe3(random.nextInt(3));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }
    public static void unsafe3(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new DmdevException("not found"));
        throw exception;
    }
}
