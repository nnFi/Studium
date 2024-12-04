package Klausurvorbereitung.Beobachter;

public class Beobachter implements IBeobachter{
    private final String name;

    public Beobachter(String name) {
        this.name = name;
    }

    public void aktualisieren(ISubjekt sub) {
        System.out.println(sub.gibZustand());
    }

    public String getName() {
        return this.name;
    }
}
