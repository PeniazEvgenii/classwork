package oop.testIerarhia;

public class TT extends Gun implements Automatic {
    public TT() {
        name = "TT";
    }

    @Override
    public void shoot(){
        System.out.println("TT");
    }

    @Override
    public void automaticShoot() {
        System.out.println("TT ведет автоматическую стрельбу");
    }
}
