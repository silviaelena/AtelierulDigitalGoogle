package oo.ch1;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        if(Math.random() >= 0.5) {
            Fighter aux = fighter1;
            fighter1 = fighter2;
            fighter2 = aux;
        }

        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter2);

            if (fighter2.getHealth() <= 0) {
                return fighter1.toString();
            }
            fighter2.attack(fighter1);
        }

        return fighter2.toString();
    }
}
