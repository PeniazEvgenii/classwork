package oop.lesson4STATIC;

import javax.xml.namespace.QName;

public class ShopItem {
    public static int id;
    private String name;
    private int volume;
    private int weight;
    private double price;

    static {
        id = 0;
    }

    public ShopItem(String name, int volume, int weight, double price) {
        this.name = name;
        this.volume = volume;
        this.weight = weight;
        this.price = price;
        id++;
    }
}

class Shop {
    public static void main(String[] args) {
        ShopItem one = new ShopItem("один", 123, 12, 111.22);
        ShopItem two = new ShopItem("один", 123, 12, 111.22);
        ShopItem three = new ShopItem("один", 123, 12, 111.22);
        ShopItem four = new ShopItem("один", 123, 12, 111.22);
        ShopItem five = new ShopItem("один", 123, 12, 111.22);
        ShopItem six = new ShopItem("один", 123, 12, 111.22);
        ShopItem seven = new ShopItem("один", 123, 12, 111.22);
        ShopItem eight = new ShopItem("один", 123, 12, 111.22);
        ShopItem nine = new ShopItem("один", 123, 12, 111.22);
        System.out.println(ShopItem.id);
    }
}
