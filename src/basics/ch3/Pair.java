package basics.ch3;

import java.util.Objects;

public class Pair {
    private int value1;
    private int value2;

    public Pair(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean checkPair(int value1, int value2) {
        return value1 + value2 == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;

        return value1 == pair.value1 && value2 == pair.value2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }
    @Override
    public String toString() {
        return "[" + value1 + ", " + value2 + "]";
    }
}
