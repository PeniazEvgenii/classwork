package decorator.pizza;

public class MainPizza {
    public static void main(String[] args) {
        Pizza vkusnaia = new MushroomDecor(new PeperoniDecor(new DecorCheese(new DecorCheese(new PizzaOsnova()))));
        System.out.println(vkusnaia.getCost());
        System.out.println(vkusnaia.getDescription());
    }
}
