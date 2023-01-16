package oo.ch1;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter1", 100 , 20);
        Fighter fighter2 = new Fighter("Fighter2", 100 , 20);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);

        System.out.println(boxingMatch.fight());
    }
}
