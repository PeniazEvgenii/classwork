package src2.Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropUtil {

    private static final Properties PROPERTIES = new Properties();



    static {
        loadProp();
    }

    private PropUtil(){}

    public static String get(String key) {
      return   PROPERTIES.getProperty(key);
    }

    private static void loadProp() {
        try (InputStream inputStream = PropUtil.class.getClassLoader().getResourceAsStream("classwork/src2/src/resourses/application.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
