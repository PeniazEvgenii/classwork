package Adapter;

import Adapter.adapter.CalculatorAdapter;

public class CalcultorAdaapterMain {
    public static void main(String[] args) {

        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        double result = calculatorAdapter.calc("12 + 6 * 5");
        System.out.println(result);
    }
}
