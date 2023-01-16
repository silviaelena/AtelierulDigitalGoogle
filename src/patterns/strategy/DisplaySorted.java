package patterns.strategy;

import java.util.Arrays;

public class DisplaySorted {
    public void displaySorted(SortingStrategy strategy, Integer[] list){
        strategy.sort(list);
    }
    public static void main(String[] args) {
        Integer[] list1 = new Integer[]{1, 15, 23, 78, 0, 42, 105, 89, 23};
        Integer[] list2 = Arrays.copyOf(list1, list1.length);

        DisplaySorted sort = new DisplaySorted();
        sort.displaySorted(new BubbleSort(), list1);
        System.out.println();
        sort.displaySorted(new MergeSort(), list2);
    }
}
