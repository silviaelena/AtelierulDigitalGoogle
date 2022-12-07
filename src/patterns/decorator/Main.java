package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        int array[];
        // Small change here
        Beverage coffee = new Coffee();
        Topping milk = new Milk(coffee);
        Beverage milkChocolateCoffee = new Chocolate(milk);
        System.out.println(milkChocolateCoffee.getDescription());

        Topping milkTea = new Milk(new Tea());
        System.out.println(milkTea.getDescription());
    }
}
