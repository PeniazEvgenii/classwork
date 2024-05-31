package decorator.pizza;

public class PizzaOsnova implements Pizza{
  //  Pizza pizza;
  // public PizzaOsnova(Pizza pizza) {
  //     this.pizza = pizza;
  // }

    @Override
    public String getDescription() {
        return "основа ";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
