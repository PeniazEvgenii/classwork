package ReflectionAPI;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(25, "Ivan", 23);

       //testMethods(user);
        testFields(user);
//        Class<? extends User> userClass = user.getClass();
//
//        Class<User> userClass1 = User.class;
//
//        System.out.println(userClass1 == userClass);

//        testConstructor();

    }
    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = user.getClass().getDeclaredMethods();

        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        System.out.println(method.invoke(user, "Sveta"));
        System.out.println(user);
    }


    private static void testFields(Object object) throws IllegalAccessException {


        Field[] declaredFields = object.getClass().getSuperclass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object o = declaredField.get(object);
            System.out.println(declaredField.getModifiers());
            System.out.println(o);
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
        }
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructors = User.class.getConstructors();
        Constructor<User> constructor = User.class.getConstructor(long.class, String.class);
        User petr = constructor.newInstance(25L, "Petr");
        System.out.println(petr);


    }

    private class Test1 {

    }
    private static class Test3{}

    private enum Test2{
        ONE

    }
}
