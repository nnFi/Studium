package MeineTestKlassen;
public class Buch
{
    public String buch;
    public int artikelnummer;
    public double preis;
    public int bestand;

    //Konstruktor
    public Buch(String buch, int artikelnummer, double preis, int bestand)
    {
        this.buch = buch;
        this.artikelnummer = artikelnummer;
        this.preis = preis;
        this.bestand = bestand;
    }

    //Getter
    public String getbuch()
    {
        return this.buch;
    }

    public int getartikelnummer()
    {
        return this.artikelnummer;
    }

    public double getpreis()
    {
        return this.preis;
    }

    public int getbestand()
    {
        return this.bestand;
    }

    //Setter
    public void preis(double preis)
    {
        this.preis = preis;
    }

    public void setbestand(int bestand)
    {
        this.bestand = bestand;
    }

    //Methoden
    public String toString()
    {
        return this.buch + ", " + this.artikelnummer + ", " + this.preis + ", " + this.bestand;
    }
}
