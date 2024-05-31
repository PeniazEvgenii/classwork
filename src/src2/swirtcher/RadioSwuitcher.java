package swirtcher;

public class RadioSwuitcher implements IElectricityConsumer{

    public void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
