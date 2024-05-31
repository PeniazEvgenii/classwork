package decorator.pizza;

public class PeperoniDecor extends DecorPizza{
    public PeperoniDecor(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return  getPizza().getDescription() + "+ peperoni";
    }

    @Override
    public double getCost() {
        return 5 + getPizza().getCost();
    }
}
