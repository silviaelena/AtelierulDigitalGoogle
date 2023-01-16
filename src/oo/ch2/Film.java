package oo.ch2;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor[] getActori() {
        return this.actori;
    }
}
