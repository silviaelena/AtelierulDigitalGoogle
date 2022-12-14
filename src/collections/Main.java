package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void useArrayList() {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Empty");
        list.add("Something");
        System.out.println(list);
    }
    public static void main(String[] args) {
        useArrayList();
    }
}
