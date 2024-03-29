package basics.ch1;

public class FizzBuzz {

    public static void main(String[] args) {
        int i = 0;

        /* command option l pentru rearanjare */
        for (i = 0; i < 100; i++) {
            /* New requirements added */
            if (i % 7 == 0) {
                System.out.println("RIZZ");
                continue;
            }

            if (i % 11 == 0) {
                System.out.println("JAZZ");
                continue;
            }
            /* New requirements done */

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("FIZZ");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("BUZZ");
                continue;
            }
            System.out.println(i);
        }
    }
}
