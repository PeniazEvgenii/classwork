package leetCode;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        String result;
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                result = "FizzBuzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else {
                result = String.valueOf(i);
            }
            list.add(result);
        }
        return list;
    }
}
