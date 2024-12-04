package Klausurvorbereitung.Iterator;

import java.util.*;

public class Itertor implements IIter {

    int position = 0;
    ArrayList p;

    public Itertor(ArrayList p){
        this.p = p;
    }

    @Override
    public boolean hasnext() {
        if (p.size() <= position) return false;
        return true;
    }

    @Override
    public Object next() {
        Person pers = (Person) p.get(position);
        position++;
        return pers;
    }
    
}
