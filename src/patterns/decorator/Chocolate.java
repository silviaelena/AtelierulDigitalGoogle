package patterns.decorator;

public class Chocolate extends Topping {
    public Chocolate(Beverage beverage) {
        super("Chocolate", 3, beverage);
    }
}
