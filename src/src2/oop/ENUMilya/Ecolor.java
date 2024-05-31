package oop.ENUMilya;

public enum Ecolor {
    GREEN("Зеленый"),
    RED("Красный"),
    YELLOW("Желтый"),
    BLACK("Черный"),
    BLUE("Синий"),
    UNKNOWN("Неизвестный")
    ;

    private final String rusName;


    Ecolor(String rusName) {
        this.rusName = rusName;
    }

     public String getRusName() {
        switch (this) {
            case GREEN:
                return rusName;
            case RED:
                return rusName;
            case YELLOW:
                return rusName;
            case BLACK:
                return rusName;
            case BLUE:
                return rusName;
        }
        return UNKNOWN.rusName;
    }

    public static Ecolor valueOfIgnoreCase(String name) {
        for (Ecolor value : Ecolor.values()) {
            if(value.name().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return UNKNOWN;
    }

    public static Ecolor ValueOfRusIgnoreCase(String name) {
        for (Ecolor value : Ecolor.values()) {
            if(name.equalsIgnoreCase(value.getRusName())){
                return value;
            }
        }
        return UNKNOWN;
    }
}
