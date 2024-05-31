package Function.lambda;

import oop.ENUMilya.Ecolor;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> fun = number -> number == 0 ? "ноль" : (number > 0 ? "положительное" : "отрицательное");
        System.out.println(fun.apply(0));


        Function<Integer, String> fun2 = number ->
        {
            String result = "отрицательное";
            if (number == 0) {
                result = "ноль";
            } else if (number > 0){
                result = "положительное";
            }
            return result;
        };
        System.out.println(fun2.apply(10));
    }
}
