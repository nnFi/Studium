package MeineTestKlassen;

public class Animal implements Comparable<Animal>
{
    private String Tier;
    private int Groesse;

    public Animal(String tier, int groesse) {
        this.Tier = tier;
        this.Groesse = groesse;
    }

    //Getter
    public String getTier() {
        return this.Tier;
    }

    public int getGroesse() {
        return this.Groesse;
    }

    //Setter
    public void setTier(String tier) {
        this.Tier = tier;
    }

    public void setGröße(int groesse) {
        this.Groesse = groesse;
    }

    @Override
    public String toString() {
        return "Animal [Tier=" + Tier + ", Groesse=" + Groesse + "]";
    }

    public int compareTo(Animal comp) {
        return this.Groesse-comp.getGroesse();
    }
}
