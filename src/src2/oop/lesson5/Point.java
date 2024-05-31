package oop.lesson5;

public class Point {
    protected int x;
    protected int y;
    public int id = 1;

    public Point(){
        System.out.println("Пустой конструктор Point");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(" конструктор Point  c двумя переменными");

    }

    public Point(int a) {
        this(a,a);
        System.out.println(" конструктор Point  c одной переменной");
    }
}

class ColorPoint extends Point {
    private int color;
    public int id = 2;

    ColorPoint(){
        System.out.println(" конструктор ColorPoint");
    }

    ColorPoint(int color) {
        super(10,15);
        this.color = color;
        System.out.println(" конструктор ColorPoint  c одной переменной");
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void printPoint() {
        System.out.println(id + " " + super.id);

    }

}

class PointPoint {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(90);
        cp.printPoint();

        Object obj1 = new Point();
        Object obj2 = new ColorPoint();
        boolean b = obj1 instanceof Point;
        System.out.println(b);

    }
}
