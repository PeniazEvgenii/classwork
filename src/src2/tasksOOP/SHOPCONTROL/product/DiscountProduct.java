package tasksOOP.SHOPCONTROL.product;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class DiscountProduct extends StandartProduct {
    private BigDecimal discount;
    private BigDecimal costEnd;
    private static final BigDecimal HUNDRED = new BigDecimal("100");

    public DiscountProduct(String name, BigDecimal cost, BigDecimal discount) {
        super(name, cost);
        this.discount = discount;
        this.costEnd = cost.subtract((cost.multiply(discount)).divide(HUNDRED,2, HALF_UP).setScale(2,HALF_UP));
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public BigDecimal getCost() {
        return costEnd;
    }

    @Override
    public String toString() {
       return super.toString() + ", скидка " +  getCost();
    }
}
