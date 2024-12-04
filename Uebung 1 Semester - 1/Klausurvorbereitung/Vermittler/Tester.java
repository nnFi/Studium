package Klausurvorbereitung.Vermittler;

public class Tester {
    public static void main(String[] args) {
        Vermittler v = new Vermittler();
        KollegeA a = new KollegeA(v);
        KollegeB b = new KollegeB(v);
        v.setA(a);
        v.setB(b);

        a.aenderung();

    }
}
