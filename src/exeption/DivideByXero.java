package exeption;

public class DivideByXero extends RuntimeException{
    public DivideByXero() {
        super("деление на ноль запрещено");
    }
}
