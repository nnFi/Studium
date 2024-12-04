package Klausurvorbereitung.Befehl;

public class Befehl2 implements IBefehl {

    public final Empfaenger e;

    public Befehl2(Empfaenger e) {
        this.e = e;
    }

    @Override
    public void fuehreaus() {
        e.ein();
    }
}
