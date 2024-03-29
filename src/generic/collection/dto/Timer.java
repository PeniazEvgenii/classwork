package generic.collection.dto;

public class Timer {
    private final long start;
    private final long stop;

    public Timer(long start, long stop) {
        this.start = start;
        this.stop = stop;
    }

    public long getStart() {
        return start;
    }

    public long getStop() {
        return stop;
    }

    public long getTime() {
        return stop - start;
    }
}
