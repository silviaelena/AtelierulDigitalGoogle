package collections.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    static int max;
    static List leaders = new ArrayList<Integer>();

    public static void main(String[] args) {
        List values = new ArrayList<Integer>() ;
        values.add(153);
        values.add(17);
        values.add(3);
        values.add(25);
        values.add(90);
        values.add(78);
        values.add(32);
        values.add(51);
        values.add(2);
        values.add(1);

        Iterator<Integer> it = values.iterator();

        Collections.reverse(values);
        if (it.hasNext()) {
            max = it.next();
            leaders.add(max);
        }

        while (it.hasNext()) {
            int curr = it.next();
            if (curr > max) {
                max = curr;
                leaders.add(max);
            }
        }

        System.out.println(leaders);
    }
}
