package Klausurvorbereitung.Proxy;

public class Datei implements IDatei{

    private String name;

    public Datei(String name) {
        this.name = name;
    }

    @Override
    public String gibDaten() {
        return "Daten von " + name + ".";
    }

    @Override
    public String gibName() {
        return this.name;
    }
    
}
