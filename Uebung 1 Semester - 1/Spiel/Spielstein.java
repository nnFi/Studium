package Spiel;

import edu.princeton.cs.introcs.StdDraw;

public class Spielstein
{
    private boolean istRot; //true = rot, flase = gelb;

    //Konstruktor
    public Spielstein(boolean istRot) 
    {
        this.istRot = istRot;
    }

    //Getter
    public boolean getColour()
    {
        return this.istRot;
    }

    //Methoden
    public void zeichne(double xpos, double ypos, double radius)
    {
        StdDraw.setPenColor(!this.istRot ? StdDraw.YELLOW : StdDraw.RED);
        StdDraw.filledCircle(xpos, ypos, radius);
    }
}
