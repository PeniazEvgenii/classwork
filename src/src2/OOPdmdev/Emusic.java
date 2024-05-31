package OOPdmdev;

public enum Emusic {
    POP("ПОП"),
    ROCK("РОК"),
    HIPHOP("ХИПХОП"),
    JAZ("ДЖАЗ"),
    METAL("МЕТАЛ"),
    UNKNOWN("НЕИЗВЕСТНЫЙ")
    ;

    private final String rusName;

    Emusic(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        switch (this) {
            case POP:
                return "ПОП";
            case ROCK:
                return "РОК";
            case HIPHOP:
                return "ХИПХОП";
            case JAZ:
                return "ДЖАЗ";
            case METAL:
                return "МЕТАЛ";
            default:
                return "НЕИЗВЕСТНЫЙ";
        }
    }

    public static Emusic checkName(String str) {
        if(str.matches("[^A-Za-z]+")) {
            for (Emusic value : Emusic.values()) {
                if (str.equalsIgnoreCase(value.getRusName())) {
                    return value;
                }
            }
        } else {
            for (Emusic value : Emusic.values()) {
                if (str.equalsIgnoreCase(value.name())) {
                    return value;
                }
            }
        }

        return UNKNOWN;
    }

}
