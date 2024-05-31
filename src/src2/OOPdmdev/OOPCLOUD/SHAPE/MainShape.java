package OOPdmdev.OOPCLOUD.SHAPE;

public class MainShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(1,10,15, "Синий");
        shapes[1] = new Circle(3,3,10, "Зеленый");
        shapes[2] = new Rectangle(3,3,8, 13, "Красный");
        shapes[3] = new Rectangle(8,66,12, 78, "Оранжевый");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
