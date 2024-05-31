package swirtcher;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<IElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(IElectricityConsumer listener){
        this.listeners.add(listener);
    }

    public void removeElectricityListener(IElectricityConsumer listener){
        this.listeners.remove(listener);
    }



    public void swithOn(){
        System.out.println("ВЫключатель включен");
     //   if(consumer != null) {
     //       consumer.electricityOn();
     //   }
        for (IElectricityConsumer listener : listeners) {
            if(listener != null) {
                listener.electricityOn();
            }
        }
    }
}
