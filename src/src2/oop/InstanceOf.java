package oop;

public class InstanceOf {
    public static void main(String[] args) {
        TestInstanceOf test1 = new ColorPoint(1, 2, 50);
        TestInstanceOf test2 = new Point(1, 2);
        System.out.println(test2 instanceof ColorPoint);

        if (test2 instanceof ColorPoint) {
            ((ColorPoint)test1).summaryXY((Point)test2);
        }
        ColorPoint po = new ColorPoint(1,2,3);
        TestInstanceOf tt = new TT();
    }
}

class Point implements TestInstanceOf{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
    public Point summaryXY(Point p) {
        return new Point(p.x + this.x, p.y + this.y);
    }
}

class ColorPoint extends Point implements TestInstanceOf {
    private int color;

    public ColorPoint(int x, int y, int color) {
        super(x,y);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}

 interface TestInstanceOf {
    int getX();
    int getY();
}
class TT implements TestInstanceOf{
int x = 1;
int y = 2;
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
