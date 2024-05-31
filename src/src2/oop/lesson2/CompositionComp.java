package oop.lesson2;

public class CompositionComp {
    public static void main(String[] args) {
        Ssd1 ssd = new Ssd1(1024);
        Hdd1 hdd = new Hdd1(4096);
        Ram1 ram = new Ram1(16000);
        Proc1 proc = new Proc1(5000);
        Power1 power = new Power1(750);

        ComputerTest comp = new ComputerTest(ssd, hdd, ram, proc, power);



        Ssd1 ssd1 = new Ssd1(512);
        Hdd1 hdd1 = new Hdd1(2000);
        Ram1 ram1 = new Ram1(8000);
        Proc1 proc1 = new Proc1(4000);
        Power1 power1 = new Power1(600);
        ComputerTest comp2 = new ComputerTest(ssd1, hdd1, ram1, proc1, power1);
        System.out.println(comp.ParametrsOfComputer());
        System.out.println();
        System.out.println(comp2.ParametrsOfComputer());
    }
}
