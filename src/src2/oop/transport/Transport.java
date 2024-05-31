package oop.transport;

public class Transport implements Itransport {
     private String brand;
     private String model;
     private int countWheel;
     private int countDoors;


     @Override
     public void setBrand(String brand) {
          this.brand = brand;
     }

     @Override
     public String getBrand() {
          return brand;
     }

     @Override
     public void setModel(String model) {
          this.model = model;
     }

     @Override
     public String getModel() {
          return model;
     }

     @Override
     public void setCountWheel(int wheel) {
          this.countWheel = wheel;
     }

     @Override
     public int getCountWheel() {
          return countWheel;
     }

     @Override
     public void setCountDoors(int door) {
          this.countDoors = door;
     }

     @Override
     public int getCountDoors() {
          return countDoors;
     }
}
