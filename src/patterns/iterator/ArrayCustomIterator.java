package patterns.iterator;

public class ArrayCustomIterator implements Iterator {
    int index;
    int[] arr;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        if (index < arr.length) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (this.hasNext()) {
            return arr[index++];
        }
        return null;
    }
}
