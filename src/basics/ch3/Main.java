package basics.ch3;

public class Main {

    /* psuedocod rezolvare Saleh:
    * 1. eliminare duplicate din array ==> se va genera un nou array cu numerele unice
    * 2. trecem prin noul array cu doua for-uri si verificam daca suma este 0
    * 3. daca gasim pereche, initializam un Pair si marim contorul */
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 3, 0};
        int n = myArray.length, i, j, nrPairs = 0;
        int[] usedIndices = new int[n];

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
