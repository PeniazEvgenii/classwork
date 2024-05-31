package Adapter.adapter;

import Adapter.CalculatorWithMathExtends;
import Adapter.ICalculator;
import Adapter.adapter.handlers.AddHandler;
import Adapter.adapter.handlers.PlusHandler;
import Adapter.adapter.handlers.api.Ihandler;

import java.util.PriorityQueue;

public class CalculatorAdapter {
    private final ICalculator calculator;
    private final PriorityQueue<Ihandler> queueHandler = new PriorityQueue<>
            ((o1, o2) -> o2.getPriority() - o1.getPriority());

    public CalculatorAdapter(){
        this.calculator = new CalculatorWithMathExtends();
        this.queueHandler.add(new AddHandler(this.calculator));
        this.queueHandler.add(new PlusHandler(this.calculator));
    }

    public double calc(String expression) {

        for (Ihandler handler : queueHandler) {
            expression = handler.handle(expression);
        }


        return Double.valueOf(expression);
    }
}
