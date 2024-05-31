package OOPdmdev.OOPCLOUD.SHAPE;

public class Circle extends Shape{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius,  String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw (){
        System.out.println("Рисуем круг c радиусом " + radius + " и цветом " + getColor() +
                ". Координаты центра (" + this.x + ";" + this.y + ")");
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
