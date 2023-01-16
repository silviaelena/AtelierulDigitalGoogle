package oo.ch3;

abstract class Animal
{
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    public void walk() {
        System.out.println("The animal has " + legs + " legs");
    }
}
