package oop.lesson3;

public class Point {
    private int x;
    private int y;
    private int color;

    {
        x = 1;
        y = 1;
        color = 50;
    }

    public Point(){}

    public Point(int x, int y, int color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
