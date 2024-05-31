package Interface;

public class Duck implements Swimabble{
   @Override
    public void swim(){
        System.out.println("Уточка плыви");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
    }

}
