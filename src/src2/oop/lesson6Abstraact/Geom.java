package oop.lesson6Abstraact;

public abstract class Geom {
   protected int width;
   protected int color;

    public abstract void draw();
}

class Line extends Geom{
    protected int x1, y1;
    protected  int x2, y2;

    @Override
    public void draw(){
        System.out.println("Рисуем линию");
    }
}

class Rect extends Geom implements MathGeom{
    protected int x1, y1;
    protected  int x2, y2;
    public void setValue(int x1, int y1 , int x2, int y2) {
        if((x1>MIN_MIN && x1<MAX_MAX)&&(y1>MIN_MIN && y1<MAX_MAX)&&(x2>MIN_MIN && x2<MAX_MAX)&&(y2>MIN_MIN && y2<MAX_MAX)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    @Override
    public double square(){
        return 5.0 * 10;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем треугольник");
    }
}

class Ellipse extends Geom implements MathGeom{
    protected int x1, y1;

    @Override
    public void draw(){
        System.out.println("Рисуем эллипс");
    }

    @Override
    public double square() {
        return 0.5 * 4 * 15;
    }
}