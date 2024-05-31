package decorator.pizza;

public abstract class DecorPizza implements Pizza{
    private Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public DecorPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
