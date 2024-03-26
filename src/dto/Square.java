package dto;

public class Square implements IFigura{
   private String color;
   private int side;

    public Square( int side, String color) {
        this.color = color;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
