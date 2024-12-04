package Klausurvorbereitung.Befehl;

import java.util.*;

public class Aufrufer {
    private List<IBefehl> befehle;

    public Aufrufer() {
        befehle = new ArrayList<>();
    }

    public void aktivieren() {
        for (IBefehl b : befehle) {
            b.fuehreaus();
        }
    }

    public void leeren() {
        befehle.clear();
    }
}
