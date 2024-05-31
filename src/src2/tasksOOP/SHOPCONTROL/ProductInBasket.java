package tasksOOP.SHOPCONTROL;

import tasksOOP.SHOPCONTROL.api.Iproduct;

public class ProductInBasket {
    private Iproduct product;
    private int count;

    public ProductInBasket(Iproduct product, int count) {
        this.product = product;
        this.count = count;
    }

    public Iproduct getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
