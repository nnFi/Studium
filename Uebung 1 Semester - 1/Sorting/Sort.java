package Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import MeineTestKlassen.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Animal> tiere = new ArrayList<>();

        Animal t1 = new Animal("Affe", 162);
        Animal t2 = new Animal("Pferd",200);
        Animal t3 = new Animal("Hund",50);

        tiere.add(t1);
        tiere.add(t2);
        tiere.add(t3);

        //Comparator Klasse 1
        System.out.println("Comparator 1");
        Collections.sort(tiere, new CompareByHeight());

        for (Animal animal : tiere) {
            System.out.println(animal.toString());
        }

        //Comparator Klasse 2
        System.out.println("Comparator 2");
        Collections.sort(tiere, new CompareByName());

        for (Animal animal : tiere) {
            System.out.println(animal.toString());
        }

        //SortedSet
        System.out.println("SortedSet");
        SortedSet<Animal> ts = new TreeSet<>();

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);

        for (Animal animal : ts) {
            System.out.println(animal.toString());
        }

        //SortedMap
        System.out.println("SortedMap");
        SortedMap<Integer, Animal> tm = new TreeMap<>();

        tm.put(1,t1);
        tm.put(1,t2);
        tm.put(1,t3);

        for (Animal animal : ts) {
            System.out.println(animal.toString());
        }

    }
}
