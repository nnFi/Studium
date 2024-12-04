package Klausurvorbereitung.Kompositum;

import java.util.*;

public abstract class Knoten {
    private String name;

    public Knoten(String name) {
        this.name = name;
    }

    public void addKnoten(Knoten k) {
        throw new UnsupportedOperationException();
    }

    public void removeKnoten(Knoten k) {
        throw new UnsupportedOperationException();
    }

    public List<Knoten> gibKinder() {
        return Collections.emptyList();
    }

    public String operation() {
        return this.name;
    }
}
