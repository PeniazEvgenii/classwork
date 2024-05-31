package ReflectionAPI;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        User dima = new User(2L, "Dima", 25);

        Annotation[] annotations = dima.getClass().getAnnotations();
        int age = dima.getClass().getDeclaredField("age").getAnnotation(MaxAge.class).description();
        System.out.println(age);


    }

}
