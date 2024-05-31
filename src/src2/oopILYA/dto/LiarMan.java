package oopILYA.dto;

public class LiarMan extends Man {

    /**
     * переопределение getTeethCount() из класса Human
     * @return 48
     */
    public int getTeethCount() {
        return 48;
    }
    public int test() {
        return super.getTeethCount();
    }
}
