package Sorting;

import java.util.Comparator;
import MeineTestKlassen.*;

public class CompareByHeight implements Comparator<Animal> {
    public int compare(Animal first, Animal second) {
        return first.getGroesse()-second.getGroesse();
    }
}
