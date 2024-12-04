package Klausurvorbereitung.Beobachter;

public interface ISubjekt {
    public void hinzufügen(IBeobachter beobachter);
    public void entfernen(IBeobachter beobachter);
    public int gibZustand();
    public void veraendere();
}
