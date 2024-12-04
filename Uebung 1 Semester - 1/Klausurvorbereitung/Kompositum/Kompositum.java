package Klausurvorbereitung.Kompositum;

import java.util.ArrayList;
import java.util.List;

public class Kompositum extends Knoten {

    private List<Knoten> kinder;

    public Kompositum(String name) {
        super(name);
        kinder = new ArrayList<>();
    }

    @Override
    public void addKnoten(Knoten k) {
        kinder.add(k);
    }

    @Override
    public void removeKnoten(Knoten k) {
        for(Knoten kn : kinder) {
            kn.removeKnoten(k);
        }
        kinder.remove(k);
    }

    public List<Knoten> gibKinder() {
        return new ArrayList<>(kinder);
    }
}
