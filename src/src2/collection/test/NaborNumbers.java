package collection.test;

import java.util.Objects;

public class NaborNumbers implements Comparable<NaborNumbers>{
    private final int a;
    private final int b;
    private final String str;

    public NaborNumbers(int a, int b, String str) {
        this.a = a;
        this.b = b;
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getStr() {
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NaborNumbers that = (NaborNumbers) o;
        return a == that.a && b == that.b && Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, str);
    }

    @Override
    public String toString() {
        return "NaborNumbers{" +
                "a=" + a +
                ", b=" + b +
                ", str='" + str + '\'' +
                '}';
    }

    @Override
    public int compareTo(NaborNumbers o) {
        int comp = this.a - o.getA();

        return comp != 0 ? comp : (this.b - o.getB() != 0 ? this.b - o.getB() : (str.compareTo(o.getStr())));


    }
}
