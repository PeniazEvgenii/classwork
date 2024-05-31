package oop.lesson3;

public class ArchComp {
    private Ssd ssd;
    private Ram ram;
            Proc proc;

    public Ram getRam1() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    private String name;

    public ArchComp(Ssd ssd, Ram ram, Proc proc, String name) {
        this.ssd = ssd;
        this.ram = ram;
        this.proc = proc;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printState() {
        System.out.println();
    }
}

    class Comositionn {
        public static void main(String[] args) {
            ArchComp com[] = new ArchComp[50];
            com[0] = new ArchComp(new Ssd(512), new Ram(16000), new Proc("Ryzen"), "Comp1");
            System.out.println(com[0].getName());
            System.out.println(com[0].proc.getProc());
            System.out.println(com[0].getRam1().getRam());
        }
    }
