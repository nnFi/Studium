package Klausurvorbereitung.Adapter;

import java.util.*;

public class Adapter implements IAdapter{

    private List<Person> personenListe;
    private PersonenLeser pl;

    public Adapter(PersonenLeser pl) {
        personenListe = new ArrayList<>();
        this.pl = pl;
    }

    @Override
    public void lesePerson() {
        pl.lesePersonen(personenListe);
    }
}
