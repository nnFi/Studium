package Klausurvorbereitung.Proxy;

public class Proxy implements IDatei{

    private IDatei realeD;
    private final String name;

    public Proxy(String name) {
        this.name = name;
    }

    public IDatei getRD() {
        if(realeD == null) {
            realeD = new Datei(name);
        }

        return realeD;
    }

    @Override
    public String gibDaten() {
        return getRD().gibDaten();
    }

    @Override
    public String gibName() {
        return this.name;
    }
    
}
