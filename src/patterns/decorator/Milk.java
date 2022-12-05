package patterns.decorator;

public class Milk extends Topping {
    public Milk(Beverage beverage) {
        super("Milk", 3, beverage);
    }
}
