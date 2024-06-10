package leetCode.cash;

public enum USD {
    TWENTY(20),
    FIFTY(50);

    private final int valueNumber;

    USD(int valueInt) {
        this.valueNumber = valueInt;
    }

    public int getValueNumber() {
        return valueNumber;
    }
}
