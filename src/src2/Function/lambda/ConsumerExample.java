package Function.lambda;

import oop.visible.Phone;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpper =
                str -> System.out.println(str.toUpperCase());

        printUpper.accept("ffdfsd");

        Consumer<Phone> salePhone =
                a -> System.out.println(a.getModel() + " " + a.getWeight());

        Consumer<Phone> salePhone2 = System.out::println;

        Phone one = new Phone("Xiaomi", "Turbo", "111111", 181);

        Consumer<Phone> salePhone3 = salePhone.andThen(salePhone2);
        salePhone3.accept(one);

    }

}
