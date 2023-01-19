package reactive.ch1;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CreateFlux {
    public static Flux emptyFlux() {
        return Flux.empty();
    }

    public static Flux fooBarFromValues() {
        return Flux.just("foo", "bar");
    }

    public static Flux <String> fooBarFluxFromList() {
        List<String> myList = new ArrayList<>();

        myList.add("foo");
        myList.add("Bar");

        return Flux.fromIterable(myList);
    }

    public static Flux <String> errorFlux() {
        IllegalStateException e = new IllegalStateException();
        return Flux.error(e);
    }

    public static Flux <Long> counter() {
        // bugs here
        return Flux.interval(Duration.ofMillis(100))
                .take(10)
                .map(i -> i);
    }

    public static void main(String[] args) {
        System.out.println(emptyFlux());
        System.out.println(fooBarFromValues());
        System.out.println(fooBarFluxFromList());
        System.out.println(errorFlux());
        counter().subscribe(val -> System.out.println(val));
    }
}
