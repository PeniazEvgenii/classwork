package dto;

public class Rectangular implements IFigura{
    private String color;
    private int sideA;
    private int sideB;

    public Rectangular(String color, int sideA, int sideB) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }
}
