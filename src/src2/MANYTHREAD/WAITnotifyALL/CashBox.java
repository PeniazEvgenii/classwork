package MANYTHREAD.WAITnotifyALL;

public class CashBox {
    private static int generator = 1;
    private int id;

    public CashBox() {
        this.id = generator++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
