package leetCode.cash;

public enum EUR {
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int valueNumber;

    EUR(int valueInt) {
        this.valueNumber = valueInt;
    }

    public int getValueNumber() {
        return valueNumber;
    }
}
