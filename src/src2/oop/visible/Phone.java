package oop.visible;

public class Phone {
    String brand;
    String model;
    String serial;
    int weight;

    public Phone(String brand, String model, String serial, int weight) {
        this.brand = brand;
        this.model = model;
        this.serial = serial;
        this.weight = weight;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", weight=" + weight +
                '}';
    }
}
