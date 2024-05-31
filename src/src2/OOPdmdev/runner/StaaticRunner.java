package OOPdmdev.runner;

import oop.lesson1.Computer;

public class StaaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer1 =  new Computer(null, null);
        Class<? extends Computer> clazz = computer1.getClass();
        System.out.println(Computer.getCounter());
        System.out.println(clazz);
    }
}
