package ReflectionAPI.tasks;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CarRunner {
    public static void main(String[] args) {
        CarAPI car = new CarAPI("Toyota", "Corolla");

        System.out.println(car);
        System.out.println(generateInsert(car));
        System.out.println(generateInsert2(car));
    }

    private static String generateInsert(CarAPI car) {
        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";

        Table table = car.getClass().getAnnotation(Table.class);
        Field[] declaredFields = car.getClass().getDeclaredFields();

        String fieldsNames = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .peek(field -> field.setAccessible(true))
                .map(field -> field.getAnnotation(Column.class))
                .map(Column::name)
                .collect(Collectors.joining(", "));


        String fieldsValues = Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> {
                    try {
                        return String.valueOf(field.get(car));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(value -> "'" + value + "'")
                .collect(Collectors.joining(", "));
        return String.format(template, table.scheme(), table.name(), fieldsNames, fieldsValues);
    }

    private static String generateInsert2(CarAPI car) {
        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";

        Table table = car.getClass().getAnnotation(Table.class);
        String nameTable = table.name();
        String schemeTable = table.scheme();

        Field[] fields = car.getClass().getDeclaredFields();

        String collect1 = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .peek(field -> field.setAccessible(true))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> field.getAnnotation(Column.class))
                .map(Column::name)
                .collect(Collectors.joining(", "));

        String collect2 = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Column.class))
                .peek(field -> field.setAccessible(true))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> {
                    try {
                        return field.get(car);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(String::valueOf)
                .map(str -> "'" + str + "'")
                .collect(Collectors.joining(", "));

        return String.format(template, schemeTable, nameTable, collect1, collect2);
    }
}
