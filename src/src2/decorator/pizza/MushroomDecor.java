package decorator.pizza;

public class MushroomDecor extends DecorPizza{
    public MushroomDecor(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return  getPizza().getDescription() + " + mushrooms ";
    }

    @Override
    public double getCost() {
        return 3 + getPizza().getCost();
    }
}
