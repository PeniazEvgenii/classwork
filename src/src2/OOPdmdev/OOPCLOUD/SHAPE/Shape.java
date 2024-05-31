package OOPdmdev.OOPCLOUD.SHAPE;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
        System.out.println("konstruktor shape");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();
}
