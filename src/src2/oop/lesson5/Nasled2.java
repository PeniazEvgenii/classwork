package oop.lesson5;

public class Nasled2 {
    protected String Headnote;
    protected String type;
    protected boolean frame;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
}

class Smartphone extends Nasled2 {


}

class Laptop extends Nasled2 {
   private int height;
    public Laptop(String Headnote,
                  String type,
                  boolean frame,
                  int x,
                  int y,
                  int width, int height) {
        this.Headnote = Headnote;
        this.frame = frame;
        this.type = type;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Desktop extends Nasled2 {
    private boolean changeSize;
    private boolean fullScreen;

}

class Composition {
    public static void main(String[] args) {
        Smartphone smart = new Smartphone();
        smart.Headnote = "Заголовокй";
        smart.type = "New Roman";
        smart.frame = true;

        Laptop lap = new Laptop("Заголовок", "Italic", false, 1,10,100,50);
        System.out.println(lap.Headnote + " " + lap.getHeight() + " " + lap.type);

    }
}
