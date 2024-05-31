package oop.lesson7ENUM;

public class MainMusic2 {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC;

        switch (mc) {
            case CLASSIC:
                System.out.println("CLASSIC");
                break;
            case POP:
                System.out.println("POP");
                break;
            case ROCK:
                System.out.println("ROCK");
                break;
        }
    }
}
