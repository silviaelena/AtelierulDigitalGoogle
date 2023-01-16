package patterns.iterator;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
