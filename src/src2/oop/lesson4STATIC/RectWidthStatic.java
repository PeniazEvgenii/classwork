package oop.lesson4STATIC;

public class RectWidthStatic {
    static int x1 = 10;
    static int x2 = 15;
    int y1 = 20;
    int y2 = 39;

    public RectWidthStatic() {
    }

    public static int rectWidth(RectWidthStatic rec){
        return Math.abs(x1-x2);
    }
}

class Test {
    public static void main(String[] args) {
        RectWidthStatic r = new RectWidthStatic();
        RectWidthStatic.x1 = 8;
        RectWidthStatic d = new RectWidthStatic();

        System.out.println(RectWidthStatic.rectWidth(r));
    }
}
