package oop;

public class Dolly implements Cloneable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Clone {
    public static void main(String[] args) {
        Dolly sheet1 = new Dolly();
        Dolly sheetCopy1 = foo(sheet1);
        sheet1.name = "one";
        sheetCopy1.name = "two";
        System.out.println(sheet1.name);
        System.out.println(sheetCopy1.name);

    }

    public static Dolly foo(Dolly dolly){
        Dolly sheet2;
        try {
            sheet2 = (Dolly) dolly.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheet2;
    }
}
