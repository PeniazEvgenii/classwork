package decorator.pizza;

public class DecorCheese extends DecorPizza{
    public DecorCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return  getPizza().getDescription() + "+ cheeze ";
    }

    @Override
    public double getCost() {
        return 2 + getPizza().getCost();
    }
}
