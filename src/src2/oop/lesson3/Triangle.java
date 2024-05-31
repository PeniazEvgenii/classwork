package oop.lesson3;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(){

    }
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void printState() {
        System.out.println("1: ("+p1.getX() +"," + p1.getY()+") " + "2: ("+p2.getX()+"," + p2.getY()+") "+ "3: ("+p3.getX()+"," + p3.getY()+") "   );
    }

}
