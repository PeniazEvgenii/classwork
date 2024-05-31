package tasksOOP.SHOPCONTROL.product;

import tasksOOP.SHOPCONTROL.api.Iproduct;

import java.math.BigDecimal;

public class StandartProduct implements Iproduct {
    private String name;
    private BigDecimal cost;

    public StandartProduct(String name, BigDecimal cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " - цена " + cost;
    }
}
