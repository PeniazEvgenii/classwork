package oop.lesson2;

public class ComputerTest {
    Ssd1 ssd1;
    Hdd1 hdd1;
    Ram1 ram1;
    Proc1 proc1;
    Power1 power1;

    public ComputerTest(Ssd1 ssd, Hdd1 hdd, Ram1 ram, Proc1 proc, Power1 power) {
        this.ssd1 = ssd;
        this.hdd1 = hdd;
        this.ram1 = ram;
        this.proc1 = proc;
        this.power1 = power;
    }

    public String ParametrsOfComputer() {
        String result = "Computer: \nRAM=" + ram1.getRam() + "\nSSD=" + ssd1.getVolume() + "\nHDD=" + hdd1.getVolume() +
                "\nprocessor=" + proc1.getFrequency() + "\npower=" + power1.getPower();
        return result;
    }

}
