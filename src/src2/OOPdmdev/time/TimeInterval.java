package OOPdmdev.time;

public class TimeInterval {
    public static final int SEC_IN_HOUR = 3600;
    public static final int SEC_IN_MINUTE = 60;

    private int second;
    private int minute;
    private int hour;


    public TimeInterval(int second) {
        this.second = second;
    }

    public TimeInterval(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getFullSecond () {
        int result = second + minute * SEC_IN_MINUTE + hour * SEC_IN_HOUR;
        return result;
    }

    public void printResult(){
        System.out.println("Сумма секунд = " + getFullSecond ());
    }

    public TimeInterval sum (TimeInterval second) {
        TimeInterval time = new TimeInterval(0);
        time.second = this.second + second.second;
        time.minute = this.minute + second.minute;
        time.hour = this.hour + second.hour;
        return time;
    }
}

class Main1 {
    public static void main(String[] args) {
         TimeInterval t = createTimeInterval();

        TimeInterval tt = new TimeInterval(30);
        TimeInterval ttt = tt.sum(t);
        ttt.printResult();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval t = new TimeInterval(6,1,1);
        t.printResult();
        return t;
    }
}
