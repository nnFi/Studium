package Klausurvorbereitung.Strategie;

public class Kontext {
    private IStrategie strategie;

    public void setzeS(IStrategie s) {
        this.strategie = s;
    }

    public void operation() {
        strategie.algo();
    }
}
