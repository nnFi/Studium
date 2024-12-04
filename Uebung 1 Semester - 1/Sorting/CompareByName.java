package Sorting;

import java.util.Comparator;
import MeineTestKlassen.*;

public class CompareByName implements Comparator<Animal> {
    public int compare(Animal first, Animal second) {
        return first.getTier().compareTo(second.getTier());
    }
}

