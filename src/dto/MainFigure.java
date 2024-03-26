package dto;

public class MainFigure {
    public static void main(String[] args) {
        IFigura circle = new Circle(5,"Синий");
        IFigura rectangular = new Rectangular("Красный", 3,6);
        IFigura square = new Square(4,"Зеленый");
        IFigura[] figuras = {circle, rectangular, square};

        System.out.println(sumSquare(figuras));
    }

    public static double sumSquare(IFigura[] figuras){
        double sum = 0;
        for (IFigura figura : figuras) {
            sum += figura.getSquare();
        }
        return sum;
    }
}
