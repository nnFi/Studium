package Klausurvorbereitung.Vermittler;

public abstract class Kollege {
    private Vermittler v;

    public Kollege(Vermittler v) {
        this.v = v;
    }

    public void aenderung() {
        v.vermittle(this);
    }
}
