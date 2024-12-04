package Klausurvorbereitung.Beobachter;

import java.util.*;

public class Subjekt implements ISubjekt{

    private List<IBeobachter> beobachter;
    private int temperatur;

    public Subjekt() {
        beobachter = new ArrayList<>();
    }

    @Override
    public void hinzufügen(IBeobachter beobachter) {
        this.beobachter.add(beobachter);
    }

    @Override
    public void entfernen(IBeobachter beobachter) {
        this.beobachter.remove(beobachter);
    }

    @Override
    public int gibZustand() {
        return this.temperatur;
    }

    @Override
    public void veraendere() {
        temperatur++;
        for (IBeobachter b : beobachter) {
            b.aktualisieren(this);
        };
    }
    
}
