package patterns.visitor;

public class Film implements Element{
    private int nrOfCopies;
    private int duration;

    public Film(int nrOfCopies, int duration) {
        this.nrOfCopies = nrOfCopies;
        this.duration = duration;
    }

    public int getNrOfCopies() {
        return nrOfCopies;
    }

    public int getDuration() {
        return duration;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}