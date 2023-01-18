package generics.exchangeDesk;

public class Rate {
    private Class source;
    private Class destination;
    private float rate;

    public Rate(Class source, Class destination, float rate) {
        this.source = source;
        this.destination = destination;
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public Class getSource() {
        return source;
    }

    public Class getDestination() {
        return destination;
    }
}