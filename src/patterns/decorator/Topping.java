package patterns.decorator;

public abstract class Topping extends Beverage {
    private Beverage beverage;

    public Topping(String description, int cost, Beverage beverage) {
        super(description, cost);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + super.getDescription();
    }

    @Override
    public int getCost() {
        return beverage.getCost() + super.getCost();
    }
}
