package Adapter.adapter.handlers;

import Adapter.ICalculator;
import Adapter.adapter.handlers.api.Ihandler;

import java.util.regex.Matcher;

public class AddHandler extends PatternHandler implements Ihandler {
    // обрабатываем умножение
    private final ICalculator calculator;

    public AddHandler(ICalculator calculator) {
        super("(\\d+\\.?\\d*) *\\* *(\\d+\\.?\\d*)");
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(2);
        return calculator.getMultiplicatin(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
