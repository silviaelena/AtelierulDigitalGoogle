package patterns.decorator;

public abstract class Beverage {
    private String description;
    private int cost;

    public Beverage(String description, int cost) {
        this.cost = cost;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCost() {
        return this.cost;
    }
}
