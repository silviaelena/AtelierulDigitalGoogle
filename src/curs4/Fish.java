package curs4;

public class Fish extends Animal implements Pet {
    protected String name;
    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Pestele mananca!");
    }

    @Override
    public void walk() {
        System.out.println("Pestele nu merge!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Pestele se joaca!");
    }
}
