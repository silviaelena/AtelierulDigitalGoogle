package generics.ch2;

public class Running implements Shoe {
    private String color;
    int size;

    public Running(String color, int size) {
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
