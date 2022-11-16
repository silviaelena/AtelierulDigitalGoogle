package basics.ch3;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 3, 0};
        int n = myArray.length, i, j, nrPairs = 0;
        int[] usedIndices = new int[]{0, 0, 0, 0, 0, 0};

        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if ((myArray[j] + myArray[i] == 0) && usedIndices[i] == 0 && usedIndices[j] == 0) {
                    usedIndices[i] = 1;
                    usedIndices[j] = 1;
                    System.out.println("New pair with value1: " + myArray[i] + " with index: " + i +
                            " and value2: " + myArray[j] + " with index: " + j);
                    nrPairs++;
                }
            }
        }
        System.out.println("Number of pairs: " + nrPairs);
    }
}
