package MANYTHREAD.DEadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Accaunt {
    private static int generator  = 1;

    private final Lock lock = new ReentrantLock();

    public Lock getLock() {
        return lock;
    }

    private int money;
    private int id;

    public Accaunt(int money) {
        this.money = money;
        this.id = generator++;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if(this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Accaunt{" +
                "money=" + money +
                ", id=" + id +
                '}';
    }
}
