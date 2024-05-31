package oop.lesson5;

public class Figure {
    public Figure() {
        System.out.println("Мы в конструкторе Фигура");
    }
    public void draw(){
        System.out.println("дро в фигуре");
    }
}

class Linia extends Figure{
    Linia(){
      //  super.draw();
    }
    @Override
    public void draw(){
        System.out.println("дро в линии");
    }
}

class Treygol extends Figure{
    Treygol(){
//        super();
    }
    @Override
    public void draw(){
        System.out.println("дро в треуголь");
    }
}

class Krug extends Figure{
    Krug(){
     //   super.draw();
    }
    @Override
    public void draw(){
        System.out.println("дро в круге");
    }
}

class Sborka {
    public static void main(String[] args) {
       // Krug kr = new Krug();

        Figure[] f = new Figure[10];
        f[0] = new Linia();
        f[1] = new Linia();
        f[2] = new Treygol();
        f[3] = new Krug();
        for (int i = 0; i < 4; i++) {
            f[i].draw();
        }


    }
}
