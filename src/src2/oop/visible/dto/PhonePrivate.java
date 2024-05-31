package oop.visible.dto;

public class PhonePrivate {
    protected String brand;
    protected String model;
    protected String serial;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(this.brand == null) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
