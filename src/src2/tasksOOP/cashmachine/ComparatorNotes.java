package tasksOOP.cashmachine;

import tasksOOP.cashmachine.api.INote;

import java.util.Comparator;

public class ComparatorNotes implements Comparator<INote> {
    @Override
    public int compare(INote o1, INote o2) {
        return o1.getValue() - o2.getValue();
    }
}
