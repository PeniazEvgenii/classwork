package oop.testIerarhia;

public class Ak47 extends Maschine{
    public Ak47() {
        name = "AK47";
    }

    @Override
    public void shoot() {
        System.out.println("Ak-47");
    }

    @Override
    public void automaticShoot() {
        System.out.println("AK47 ведет автоматическую стрельбу");
    }
}
