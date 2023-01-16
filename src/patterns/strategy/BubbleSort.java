package patterns.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        int listSize = list.length;
        int aux = 0;
        int i, j;

        for (i = 0; i < listSize - 1; i++) {
            for (j = 0; j < (listSize - i - 1); j++) {
                if (list[j] > list[j + 1]) {
                    aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }

        for (i = 0; i < listSize; i++){
            System.out.print(list[i] + " ");
        }
    }
}
