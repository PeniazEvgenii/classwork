package MANYTHREAD.DEadlock;

public class AccountThread extends Thread{

    private final Accaunt accauntFrom;
    private final Accaunt accauntTo;

    public AccountThread(Accaunt accauntFrom, Accaunt accauntTo) {
        this.accauntFrom = accauntFrom;
        this.accauntTo = accauntTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try {
                if(accauntFrom.takeOff(10)){
                    accauntTo.add(10);
                }
            } finally {
                accauntFrom.getLock().unlock();
                accauntTo.getLock().unlock();
            }
        }
    }

    private void lockAccounts() {
        while(true) {
            boolean fromLockResult = accauntFrom.getLock().tryLock();
            boolean toLockResult = accauntTo.getLock().tryLock();
            if (fromLockResult && toLockResult) {
                break;
            }
            if(fromLockResult) {
                accauntFrom.getLock().unlock();
            }
            if(toLockResult) {
                accauntFrom.getLock().unlock();
            }
        }
    }
}