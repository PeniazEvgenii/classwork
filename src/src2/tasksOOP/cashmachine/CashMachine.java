//
//
//
//import java.util.*;
//
//public class CashMachine implements tasksOOP.cashmachine.api.ICashMachineUser, ICashMAchineAdmin {
//    private final String name;
//    private final Map<INote, Integer> availableNote = new TreeMap<>(Comparator.comparing(INote::getValue).reversed());
//
//    public CashMachine(String name) {
//        this.name = name;
//    }
//
//    public void addNoteInATM(INote note, int value) {
//        availableNote.put(note, value);
//    }
//
//    public Map<INote, Integer> getAvailableNote() {
//        return availableNote;
//    }
//
//    public INote[] takeNotes(int amount) {
//        Map<INote, Integer> tempNotes = new TreeMap<>(Comparator.comparing(INote::getValue).reversed());
//        tempNotes.putAll(availableNote);
//        List<INote> resultList = new ArrayList<>();
//
//        for (Map.Entry<INote, Integer> entry : tempNotes.entrySet()) {
//            int valueCurrent = entry.getKey().getValue();
//            Integer countCurrent = entry.getValue();
//            int countNeed = amount / valueCurrent;
//
//            int ostatok = countCurrent - countNeed;
//            if (ostatok < 0) {
//                countNeed = countCurrent;
//            }
//
//
//            amount -= countNeed * valueCurrent;
//            tempNotes.put(entry.getKey(), Math.max(ostatok, 0));
//
//            for (int i = 0; i < countNeed; i++) {
//                resultList.add(entry.getKey());
//            }
//        }
//
//        if (amount == 0) {
//            availableNote.putAll(tempNotes);
//            return resultList.toArray(new INote[0]);
//        } else {
//            return null;
//        }
//
//    }
//
//    public Check getCheck(int amount) {
//        return new Check(amount, name);
//    }
//
//    private boolean checkMoney(int amount) {
//        return amount <= getSumMoney() &&
//                amount % minNoteInATM().getValue() == 0;
//    }
//
//    private int getSumMoney() {
//        int sum = 0;
//
//
//        return sum;
//    }
//
//    private INote minNoteInATM() {
//        return availableNote.entrySet().stream()
//                .filter(e -> e.getValue() > 0)
//                .map(Map.Entry::getKey)
//                .min((i1, i2) -> i2.getValue() - i1.getValue())
//                .get();
//
//    }
//
//
//}
