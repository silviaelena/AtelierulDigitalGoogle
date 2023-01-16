package oo.ch3;

public class Fish extends Animal implements Pet {
    private String name;

    protected Fish() {
        super(0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("The fish plays");
    }

    public void eat() {
        System.out.println("The fish eats");
    }

    public void walk() {
        System.out.println("The fish doesn't have legs");
    }
}