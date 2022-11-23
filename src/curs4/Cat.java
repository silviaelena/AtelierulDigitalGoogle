package curs4;

public class Cat extends Animal implements Pet {
    private String name;

    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    protected Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Pisica mananca!");
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
        System.out.println("Pisica se joaca!");
    }
}
