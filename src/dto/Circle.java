package dto;

public class Circle implements IFigura{
   private String color;
   private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius,2);
    }
}
