package oop.testIerarhia;

public class Main {
    public static void main(String[] args) {
     //   Gun tt22 = new TT();
     //   Object cc22 = new TT();
     //   tt22.shoot();

        TT tt1 = new TT();
        System.out.println(tt1.name);
        tt1.automaticShoot();
        tt1.shoot();

        Ak47 ak47 = new Ak47();
       // ak47.automaticShoot();

        Test test = new Test();
        test.foo(ak47);
        if (ak47 instanceof Automatic) {
            ak47.automaticShoot();
        }
    }

}

class Test {
    public void foo(Automatic wep){
        wep.automaticShoot();
    }
}
