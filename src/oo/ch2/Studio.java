package oo.ch2;

public class Studio {
    private String nume;
    private Film[] filme;

    Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public Film[] getFilme() {
        return this.filme;
    }

    public String getNume() {
        return this.nume;
    }
}
