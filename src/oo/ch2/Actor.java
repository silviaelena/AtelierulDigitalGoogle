package oo.ch2;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return this.nume;
    }

    public Integer getVarsta() {
        return this.varsta;
    }
}
