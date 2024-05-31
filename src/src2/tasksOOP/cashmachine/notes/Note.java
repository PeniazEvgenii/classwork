package tasksOOP.cashmachine.notes;

import tasksOOP.cashmachine.api.INote;

public class Note implements INote {
    public Note(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Note_50{" +
                "value=" + value +
                '}';
    }
}
