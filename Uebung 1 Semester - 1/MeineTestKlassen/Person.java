package MeineTestKlassen;

import java.util.*;

public class Person {
    private int alter;
    private String name;
    private Map<String, String> nummer;
    // String[] String = new String[5] -> Array Delkarieren

    //Konstruktor
    public Person(int alter, String name) {
        this.alter = alter;
        this.name = name;
        this.nummer = new HashMap<String, String>();
    }

    //Getter
    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    public String getNumber(String key) {
        return nummer.get(key);
    }

    //Setter
    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String key, String value) {
        nummer.put(key, value);
    }

    //Methoden
    public void removeNumber(String key) {
        nummer.remove(key);
    }

    public Object tester() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.name);
        sb.append("\n");
        sb.append("Alter: " + this.alter);
        sb.append("\n");

        for (Map.Entry<String, String> pair : nummer.entrySet()) {
            sb.append(pair.getKey() + ": " + pair.getValue());
            sb.append("\n");
        }

        //nummer.foreach((k,v) -> {sb.apppend(k + ": " + v)});

        return sb.toString();
    }
}
