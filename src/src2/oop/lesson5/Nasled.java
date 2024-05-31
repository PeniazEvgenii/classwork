package oop.lesson5;

public class Nasled {
    public static void main(String[] args) {
        Line l = new Line();
        l.color = 10;
        System.out.println(l.color);

        System.out.println(l.getWidth());
        l.setWidth(15);
        System.out.println(l.getWidth());

        Properties p = (Properties)l; //управление дочерним обектом через родительский класс
        p.color = 19;

        System.out.println(l.color); // цвет поменялся

    }
}


class Properties {
    private int width;
    protected int color;

    Properties(int w){
        width = w;
        System.out.println("конструктор пропертис");
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
}


class Line extends Properties {
    double x1, y1;
    double x2, y2;
    Line() {
        super(-1);
        System.out.println("конструктор line");
    }
}

class Triangle extends Properties {
    double x1, y1;
    double x2, y2;
    double x3, y3;

    public Triangle(int w) {
        super(w);
    }
}

class Rectangle extends Properties{
    double x1, y1;
    double x2, y2;

    public Rectangle(int w, double x1) {
        super(w);
        this.x1 = x1;
    }
}

class Ellipse extends Properties{
    public Ellipse() {
        super(10);
    }
    double x1, x2;
    double y1, y2;
}