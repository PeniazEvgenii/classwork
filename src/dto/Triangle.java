package dto;


public class Triangle {
    public int a;
    public int b;
    public int c;

    /**
     * применяем когда хотим создать равностроронний треугольник
     * @param side сторона треугольника
     */
    public Triangle(int side){
        this.a = side;
        this.b = side;
        this.c = side;
    }

    /**
     *
     * @param side1 значение стороны а
     * @param side2 значение стороны б
     * @param side3 значение стороны с
     */
    public Triangle(int side1, int side2, int side3){
        this.a = side1;
        this.b = side2;
        this.c = side3;
    }

    public Triangle(int side1, int side2){
        this.a = side1;
        this.b = side1;
        this.c = side2;
    }

    /**
     * Применяем когда не определились какие значения будут для наших полей
     */
    public Triangle() {
    }



}
