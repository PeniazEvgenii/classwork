package oop.lesson3;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        Triangle tr1 = new Triangle(p1, p2, p3);
        tr1.printState();

    }
}


