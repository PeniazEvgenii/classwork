package Exception;

import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeoutException;

public class Exception_TestT {
    private static final Map<Integer, Throwable> MAP_EXP = Map.of(
            0, new RuntimeException("Runtime"),
            1, new FileNotFoundException("file not found "),
            2, new IndexOutOfBoundsException("Out of bound")
    );
    public static void main(String[] args) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        try {
            unsafe(rand.nextInt(0,3));
        } catch (RuntimeException re){
            re.printStackTrace();
        }
        catch (Throwable e) {
            e.printStackTrace();

        }


    }

    public static void unsafe(int randValue) throws Throwable {
        Throwable throwable = MAP_EXP.getOrDefault(randValue, new DDDEXCEPTIOn("DDDDD"));
        throw throwable;
    }
}
