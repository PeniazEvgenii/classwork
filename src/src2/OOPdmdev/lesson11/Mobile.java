package OOPdmdev.lesson11;

public class Mobile extends Computer{

    @Override
    public String getName() {
        return "MOBILE";
    }

    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Я включился");
    }
}
