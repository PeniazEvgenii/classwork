package swirtcher;

import java.util.function.Consumer;

public class LampSwitch implements IElectricityConsumer {



    private void lightOn() {
        System.out.println("лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
