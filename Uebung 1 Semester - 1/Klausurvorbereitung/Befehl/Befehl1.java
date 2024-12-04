package Klausurvorbereitung.Befehl;

public class Befehl1 implements IBefehl{

    public final Empfaenger e;

    public Befehl1(Empfaenger e) {
        this.e = e;
    }

    @Override
    public void fuehreaus() {
        e.aus();
    }
}
