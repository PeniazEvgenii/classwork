package tasksOOP.SHOPCONTROL;

import tasksOOP.SHOPCONTROL.api.Iproduct;
import tasksOOP.SHOPCONTROL.product.DiscountProduct;
import tasksOOP.SHOPCONTROL.product.ProductDamage;
import tasksOOP.SHOPCONTROL.product.StandartProduct;

import java.math.BigDecimal;

public class MainProduct {
    public static void main(String[] args) {
        Iproduct product1 = new StandartProduct("Молоко", new BigDecimal("4.15"));
        Iproduct product2 = new StandartProduct("Колбаса", new BigDecimal("20.50"));
        Iproduct product3 = new DiscountProduct("Бананы", new BigDecimal("15"), new BigDecimal("10"));
        Iproduct product4 = new DiscountProduct("Сыр", new BigDecimal("18"), new BigDecimal("35"));
        Iproduct product5 = new ProductDamage("Телевизор", new BigDecimal("118"), new BigDecimal("48"), "Царапины");
        Iproduct product6 = new ProductDamage("Персик", new BigDecimal("25"), new BigDecimal("34"), "Старые");

        Shop shop = new Shop();
        shop.addInShop(product1);
        shop.addInShop(product2);
        shop.addInShop(product3);
        shop.addInShop(product4);
        shop.addInShop(product5);
        shop.addInShop(product6);

        for (Iproduct iproduct : shop.getProductShop()) {
            System.out.println(iproduct);
        }

        Basket basket = shop.getBasket();
        basket.addInBasket(product1, 3);
        basket.addInBasket(product2, 2);
        basket.addInBasket(product3, 1);
        basket.addInBasket(product4, 5);
        basket.addInBasket(product5, 2);
        basket.addInBasket(product6, 3);

        System.out.println();

        Check check = shop.getCheck(basket);
        System.out.println(check);

    }
}
