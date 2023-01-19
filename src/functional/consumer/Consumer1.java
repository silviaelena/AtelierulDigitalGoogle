package functional.consumer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    @Test
    public void consumer_1(){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c" ));
        Consumer<List<String>> consumer = (list1) -> list1.clear();
        consumer.accept(list);
        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void consumer_2(){
        List<String> list1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "first", "second"));
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = (list) -> c1.andThen(c2).accept(list);
        consumer.accept(list1);
        Assert.assertEquals(list1, list2);

    }
}