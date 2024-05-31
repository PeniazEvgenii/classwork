package swirtcher;

public class ProgrammMain {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        IElectricityConsumer lamp = new LampSwitch();
        IElectricityConsumer radio = new RadioSwuitcher();

       sw.addElectricityListener(lamp);
       sw.addElectricityListener(radio);
       sw.swithOn();

       sw.addElectricityListener(new IElectricityConsumer() {
           @Override
           public void electricityOn() {
               System.out.println("пожар");
           }
       });


        sw.addElectricityListener(() -> System.out.println("Пожар"));
        sw.swithOn();
    }
}
