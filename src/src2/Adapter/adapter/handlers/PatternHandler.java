package Adapter.adapter.handlers;

import Adapter.ICalculator;
import Adapter.adapter.handlers.api.Ihandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements Ihandler {

    private final Pattern pattern;

    public PatternHandler(String regexp) {
        this.pattern = Pattern.compile(regexp); //хз
    }

    @Override
    public final String handle(String expression) {

        boolean isMatch = false;
        do {
            Matcher matcher = this.pattern.matcher(expression);
            isMatch = matcher.find();
            if (isMatch) {
               matcher.group();
               double result = calc(matcher);


                do {
                    expression = expression.replace(matcher.group(), String.valueOf(result));
                } while (expression.contains(matcher.group()));
            }
        } while (isMatch);
        return expression;
    }

    protected abstract double calc(Matcher matcher);

}
