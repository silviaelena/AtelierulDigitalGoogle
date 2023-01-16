package oo.ch1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
    public float getHealth() {
        return health;
    }
    public String toString() {
        return name;
    }
}
