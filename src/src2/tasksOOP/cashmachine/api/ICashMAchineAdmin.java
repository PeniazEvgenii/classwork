package tasksOOP.cashmachine.api;

import java.util.Map;

public interface ICashMAchineAdmin {
    void addNoteInATM(INote note, int value);

    Map<INote, Integer> getAvailableNote();
}
