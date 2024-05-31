package tasksOOP.SHOPCONTROL.product;

import java.math.BigDecimal;

public class ProductDamage extends DiscountProduct{
    private String causeOfDamage;

    public ProductDamage(String name, BigDecimal cost, BigDecimal discount, String causeOfDamage) {
        super(name, cost, discount);
        this.causeOfDamage = causeOfDamage;
    }

    @Override
    public String toString() {
        return super.toString() + ", причина уценки " + " - " + causeOfDamage;
    }
}
