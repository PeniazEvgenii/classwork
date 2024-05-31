package oop.lesson1;

public class CompositionRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(512);
        System.out.println(ram.getValue());
        ram.setValue(1024);

        Ssd ssd = new Ssd(512);
        System.out.println(ssd.getValue());

        Computer computer1 = new Computer(ram, ssd);
        computer1.printState();

    }
}
