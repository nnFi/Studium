package MeineTestKlassen;
public class Punkt
{
    public int x;
    public int y;

    //Konstruktor
    public Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Getter
    public int getx()
    {
        return this.x;
    }

    public int gety()
    {
        return this.y;
    }

    //Setter
    public void setx(int x)
    {
        this.x = x;
    }

    public void sety(int y)
    {
        this.y = y;
    }

    public void setxy(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Methoden
    public String toString()
    {
        return "x: " + this.x + ", y: " + this.y;
    }

    public int addition()
    {
        return this.x + this.y;
    }

    public int substraktion()
    {
        return this.x - this.y;
    }
}