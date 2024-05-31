package tasksOOP.SHOPCONTROL;

import tasksOOP.SHOPCONTROL.api.Iproduct;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<ProductInBasket> list = new ArrayList<>();

    public Basket() {
    }

    public List<ProductInBasket> getList() {
        return list;
    }

    public void addInBasket(Iproduct product, int value) {
        list.add(new ProductInBasket(product,value));
    }
}
