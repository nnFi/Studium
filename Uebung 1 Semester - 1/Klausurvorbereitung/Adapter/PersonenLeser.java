package Klausurvorbereitung.Adapter;

import java.util.*;

public class PersonenLeser {
    public void lesePersonen(List<Person> pl) {
        for (Person p : pl) {
            System.out.println(p.getName());
        }
    }
}
