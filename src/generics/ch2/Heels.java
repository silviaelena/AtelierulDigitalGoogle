package generics.ch2;

public class Heels implements Shoe {
    private String color;
    int size;

    public Heels(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }
}
