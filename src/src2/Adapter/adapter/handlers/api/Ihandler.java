package Adapter.adapter.handlers.api;

public interface Ihandler {
    String handle(String expression);

    int getPriority();
}
