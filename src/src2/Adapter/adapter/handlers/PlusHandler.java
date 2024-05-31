package Adapter.adapter.handlers;

import Adapter.ICalculator;
import Adapter.adapter.handlers.api.Ihandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlusHandler extends PatternHandler implements Ihandler {
    // обрабатываем сложение
    private final ICalculator calculator;

    public PlusHandler(ICalculator calculator) {
        super("(\\d+\\.?\\d*) *\\+ *(\\d+\\.?\\d*)");
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(2);
        return calculator.getAddition(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }



    @Override
    public int getPriority() {
        return 1;
    }
}
