package tasksOOP.cashmachine;

import tasksOOP.cashmachine.api.INote;
import tasksOOP.cashmachine.notes.Note;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Check {
    private List<String> list = new ArrayList<>();
    private int sum;
    private String name;

    public Check(int sum, String name) {
        this.sum = sum;
        this.name = name;
    }

    @Override
    public String toString() {

        String stringBuilder = name + "\n" +
                "Время снятия денег:" + "\n" +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy года, HH:mm:ss")) + "\n" +
                "Сумма: " + sum;
        return stringBuilder;

    }

}
