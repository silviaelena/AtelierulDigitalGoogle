package curs4;

public class Spider extends Animal{

    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Paianjenul mananca!");
    }
}
