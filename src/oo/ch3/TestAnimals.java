package oo.ch3;

public class TestAnimals {
    public static void main(String[] args) {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal c2 = new Cat();
        Animal e = new Spider();
        Pet p = new Cat();


        d.eat();
        d.walk();
        d.setName("Fishy");
        System.out.println(d.getName());
        System.out.println();

        a.eat();
        a.walk();
        System.out.println();

        c.setName("Whiskers");
        System.out.println(c.getName());
        c.eat();
        c.walk();
        c.play();
        System.out.println();

        p.setName("Bob");
        System.out.println(p.getName());
        p.play();
        System.out.println();

        c2.walk();
        c2.eat();
        System.out.println();

        e.eat();
        e.walk();
        System.out.println();
    }
}