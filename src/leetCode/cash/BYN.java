package leetCode.cash;

public enum BYN {
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    TWO_HUNDRED(200),
    FIVE_HUNDRED(500);

    private final int valueNumber;

    BYN(int valueInt) {
        this.valueNumber = valueInt;
    }

    public int getValueNumber() {
        switch (this) {
            case TWENTY:
                return valueNumber;
            case FIFTY:
                return valueNumber;
            case HUNDRED:
                return valueNumber;
            case TWO_HUNDRED:
                return valueNumber;
            case FIVE_HUNDRED:
                return valueNumber;
        }


        return valueNumber;
    }
}
