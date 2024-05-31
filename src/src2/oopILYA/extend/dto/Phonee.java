package oopILYA.extend.dto;

public class Phonee {
    private final String brand;

    public Phonee(String brand) {
        this.brand = brand;
    }
    public Phonee() {
        this.brand = "default";
    }

    public final String getBrand() {
        return brand;
    }

 // public void setBrand(String brand) {
 //      this.brand = brand;
 // }

}
