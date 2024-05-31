package oop.lesson6Abstraact;

public class SborkaGeom {
    public static void main(String[] args) {
        Geom[] geo = new Geom[3];
        geo[0] = new Line();
        geo[1] = new Rect();
        geo[2] = new Ellipse();
        for (int i = 0; i < geo.length; i++) {
            geo[i].draw();

            if(geo[i] instanceof MathGeom) {
                double square = ((MathGeom) geo[i]).square();
                System.out.println("ПЛощадь = " + square);
            }
        }
        Line line1 = new Line();
        Rect rect1 = new Rect();
       boolean b = geo[1] instanceof MathGeom;

        rect1.setValue(2,3,4,5);
        System.out.println(rect1.x1);
    }
}
