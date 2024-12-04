package Klausurvorbereitung.Iterator;

import java.util.*;

public class Daten implements IDaten {

    ArrayList p;

    public Daten() {
        this.p = new ArrayList();
    }

    public void add(Person pers) {
        p.add(pers);
    }

    @Override
    public Itertor createIter() {
        return new Itertor(new ArrayList(p));
    }
}
