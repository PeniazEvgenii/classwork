package tasksOOP.SHOPCONTROL.api;

import tasksOOP.SHOPCONTROL.Basket;

import java.util.List;

public interface IShopCustomer {
    List<Iproduct> getProductShop();
    Basket getBasket();
}
