package oop.lesson6Abstraact;

public class Main1 {
    public static void main(String[] args) {
     // нельзя создавать из абстрактного класса экземпляры
     // абстрактный класс создается для дальнейшего наследования
    //   ToyotaCorolla corolla = new ToyotaCorolla();
    //   corolla.model = "Corrolla";
    //   System.out.println(corolla.model);
    //   corolla.go();
    //   corolla.stop();
    //   corolla.draw();

    //   ToyotaCamry camry = new ToyotaCamry();
    //   System.out.println("\n" + (corolla.model = "camry"));
    //   camry.go();
    //   camry.stop();
    //   camry.draw();

        System.out.println("Создадим массив ссылок Cars");
        int N = 4;
        Car[] cars = new Car[N];
        cars[0] = new ToyotaCorolla();
        cars[1] = new ToyotaCamry();
        cars[2] = new ToyotaCorolla();
        cars[3] = new ToyotaCamry();
        System.out.println(cars[0] instanceof ToyotaCamry);
        for (Car c : cars) {
            c.go();
            c.stop();
            c.draw();
            System.out.println();
        }
    }
}

abstract class Car {
     protected String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public abstract void go();
    public abstract void stop();
    public abstract void draw();
}

class ToyotaCorolla extends Car {
    @Override
    public void go() {
        System.out.println("Toyota Corolla едет");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Corolla остановилась");
    }

    @Override
    public void draw() {
        System.out.println("Рисование Toyota Corolla");
    }
}

class ToyotaCamry extends Car {
    @Override
    public void go() {
        System.out.println("Toyota Camry едет");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Camry остановилась");
    }

    @Override
    public void draw() {
        System.out.println("Рисование Toyota Camry");
    }
}