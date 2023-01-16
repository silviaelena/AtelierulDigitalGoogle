package patterns.visitor;

public class Album implements Element{
    private int nrOfCopies;
    private int nrOfSongs;

    public Album(int nrOfCopies, int nrOfSongs) {
        this.nrOfCopies = nrOfCopies;
        this.nrOfSongs = nrOfSongs;
    }

    public int getNumberOfCopies() {
        return nrOfCopies;
    }

    public int getNumberOfSongs() {
        return nrOfSongs;
    }

    public void accept(Visitor v) {
        v.visit(this);

    }
}
