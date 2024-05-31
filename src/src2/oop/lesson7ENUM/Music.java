package oop.lesson7ENUM;

public enum Music {
    CLASSIC(5), ROCK(8), POP(10);

    private int i;

    Music(int i) {
        this.i = i;
    }

    public void foo() {
        System.out.println("It's true");
    }
}
