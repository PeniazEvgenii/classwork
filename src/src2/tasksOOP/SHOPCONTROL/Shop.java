package tasksOOP.SHOPCONTROL;

import tasksOOP.SHOPCONTROL.api.IShopAdmin;
import tasksOOP.SHOPCONTROL.api.IShopCustomer;
import tasksOOP.SHOPCONTROL.api.Iproduct;

import java.util.ArrayList;
import java.util.List;

public class Shop implements IShopAdmin, IShopCustomer {
    private final List<Iproduct> productShop ;

    public Shop() {
        this.productShop = new ArrayList<>();
    }

    public void addInShop(Iproduct product) {
        productShop.add(product);
    }

    public List<Iproduct> getProductShop() {
        return productShop;
    }

    public Basket getBasket() {
        return new Basket();
    }

    public Check getCheck(Basket basket){
        Check check = new Check();
        for (ProductInBasket productInBasket : basket.getList()) {
            check.add(productInBasket);
        }
        return check;
    }



}
