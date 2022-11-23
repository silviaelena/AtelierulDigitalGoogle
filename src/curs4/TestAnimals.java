package curs4;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.setName("Pestisor");
        System.out.println(d.getName());
        d.play();
        System.out.println();

        c.eat();
        c.walk();
        System.out.println(c.getName());
        c.setName("tomita");
        c.play();
        System.out.println();

        a.eat();
        a.walk();
        System.out.println();

        System.out.println(p.getName());
        p.setName("tomitaaa");
        System.out.println();

    }
}
