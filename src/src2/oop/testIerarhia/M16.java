package oop.testIerarhia;

public class M16 extends Maschine{
    public M16() {
        name = "M16";
    }

    @Override
    public void shoot() {
        System.out.println("M16");
    }
    @Override
    public void automaticShoot() {
        System.out.println("M16 ведет автоматическую стрельбу");
    }
}
