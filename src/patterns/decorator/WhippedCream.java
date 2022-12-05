package patterns.decorator;

public class WhippedCream extends Topping {
    public WhippedCream(String description, int cost, Beverage beverage) {
        super("Whipped Cream", 3, beverage);
    }
}
