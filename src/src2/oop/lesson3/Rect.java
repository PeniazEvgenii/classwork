package oop.lesson3;

public class Rect {
    private int xUp;
    private int yUp;
    private int xDown;
    private int yDown;
    private  int width;
    private int height;

    public int getxUp() {
        return xUp;
    }

    public void setxUp(int xUp) {
        this.xUp = xUp;
    }

    public int getyUp() {
        return yUp;
    }

    public void setyUp(int yUp) {
        this.yUp = yUp;
    }

    public int getxDown() {
        return xDown;
    }

    public void setxDown(int xDown) {
        this.xDown = xDown;
    }

    public int getyDown() {
        return yDown;
    }

    public void setyDown(int yDown) {
        this.yDown = yDown;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rect() {
    }

    public Rect(int xUp, int yUp, int xDown, int yDown) {
        this.xUp = xUp;
        this.yUp = yUp;
        this.xDown = xDown;
        this.yDown = yDown;
    }

    public Rect(int xUp, int yUp, int xDown, int yDown, int width, int height) {
        this.xUp = xUp;
        this.yUp = yUp;
        this.xDown = xDown;
        this.yDown = yDown;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(10, 10, 11, 11);
        Rect r3 = new Rect(15, 15, 18, 13, 10, 15);
        System.out.println(r3.getxUp()+" " + r3.getyUp()+" "+r3.getxDown()+" " +r3.getyDown() + " " + r3.getWidth() + " " + r3.getHeight());

    }
}
