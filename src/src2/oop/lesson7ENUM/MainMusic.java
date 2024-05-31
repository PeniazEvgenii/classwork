package oop.lesson7ENUM;

public class MainMusic {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC;

        for(Music element: Music.values()){
            System.out.println(element);
        }
        Music mc2 = Music.valueOf(Music.class,"ROCK");
        Music mc3 = Music.valueOf("POP");

        System.out.print(mc + " ");
        System.out.print(mc2 + " ");
        System.out.print(mc3 + " ");
        System.out.println();
        System.out.println(mc3.ordinal());

        mc.foo();

    }
}
