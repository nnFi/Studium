package Spiel;

import edu.princeton.cs.introcs.StdDraw;

public class Spielfeld
{
    private static final double picksize = 0.8; //Downsize or Upsize Circle
    private static final int maxX = 1000;
    private static final int maxY = 1000;
    private double sizeV;
    private double sizeH;
    private int row;
    private int column;
    private int fields;
    private Spielstein steine[][];

    //Konstruktor
    public Spielfeld(int row, int column)
    {
        this.row =row;
        this.column = column;
        this.steine = new Spielstein[column][row];
        this.sizeV = maxX / row;
        this.sizeH = maxY / column;
        this.fields = row*column;
    }

    //Getter
    public int getfields()
    {
        return this.fields;
    }

    //Methoden (public)
    public void neuesspiel()
    {
        //Bereitet neues Spielfeld vor
        clear();
        this.steine = new Spielstein[this.column][this.row];
        zeichne();
    }

    public void zeichne()
    {
        //Zeichent Spielfeld
        StdDraw.setXscale(0, maxX);
        StdDraw.setYscale(0, maxY);
        StdDraw.setPenColor(StdDraw.BLACK);

        for(int r = 0; r<this.row;r++)
        {
            for(int c = 0; c<this.column; c++)
            {
                StdDraw.circle(calcxpos(c), calcypos(r), calcradius());
            }
        }
    }

    public boolean setzestein(int column,boolean colour) 
    {
        //Setzt Steine
        if(column > this.column || column < 0) return false;
        column -= 1;
        for(int i = 0; i < this.row; i++)
        {
            if (this.steine[column][i] == null)
            {
                this.steine[column][i] = new Spielstein(colour);
                this.steine[column][i] .zeichne(calcxpos(column), calcypos(i), calcradius());
                this.fields--;
                return true; //Stein gesetzt
            }
        }
        return false; //Spalte voll
    }

    public boolean checkwinner(int xpos, boolean colour)
    {
        //Holte die y-Postion aus dem Feld, in welche der Stein gesetzt wurde
        int ypos = 0;
        xpos -= 1;
        for(int i = this.row-1; i >= 0; i--)
        {
            if (this.steine[xpos][i] != null && this.steine[xpos][i].getColour() == colour)
            {
                ypos = i; //Spalte letzter gesetzter Stein
                break;
            }
        }

        //Prüfen in alle Richtungen ob es einen Sieger gibt
        if(checkvert(xpos, ypos, colour)) return true;

        if(checkhorz(xpos, ypos, colour)) return true;

        if(checkdiagoright(xpos, ypos, colour)) return true;

        if(checkdiagoleft(xpos, ypos, colour)) return true;

        return false;
    }

    //Methoden (private)
    private void clear()
        {
            //Leert Diagramm
            StdDraw.clear();
        }

    private double calcxpos(int xpos)
    {
        //Bestimmt x Position im Diagramm
        return xpos * sizeH + sizeH / 2;
    }

    private double calcypos(int ypos)
    {
        //Bestimmt y Position im Diagramm
        return ypos * sizeV + sizeV / 2;
    }

    private double calcradius()
    {
        //Bestimmt Radius der Steine
        return (((sizeH + sizeV) / 2) / 2) * picksize;
    }

    private boolean checkvert(int xPos, int yPos, boolean colour)
    {
        //Prüft vertikal nach 4 gleichen
        int counter = 1;

        //Vertikal hoch
        for(int vlup = yPos+1; vlup < this.row; vlup++)
        {
            if(this.steine[xPos][vlup] != null)
            {
                if(this.steine[xPos][vlup].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }

        //Vertikal runter
        for(int vldown = yPos-1; vldown >= 0; vldown--)
        {
            if(this.steine[xPos][vldown] != null)
            {
                if(this.steine[xPos][vldown].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }
         return false;
    }

    private boolean checkhorz(int xPos, int yPos, boolean colour)
    {
        //Prüft horizontal nach 4 gleichen
        int counter = 1;

        //Horizontal rechts
        for(int hzup = xPos+1; hzup < this.column; hzup++)
        {
            if(this.steine[hzup][yPos] != null)
            {
                if(this.steine[hzup][yPos].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }

        //Horizontal links
        for(int hzdown = xPos-1; hzdown >= 0; hzdown--)
        {
            if(this.steine[hzdown][yPos] != null)
            {
                if(this.steine[hzdown][yPos].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }
        return false;
    }

    private boolean checkdiagoright(int xPos, int yPos, boolean colour)
    {
        //Prüft aufsteigend rechts(++) und absteigend links(--) nach 4 gleichen
        int counter = 1;

        //Absteigend links
        for(int downl = 1; downl <= 3; downl++)
        {
            if(xPos-downl < 0 || yPos-downl < 0) break;
            if(this.steine[xPos-downl][yPos-downl] != null)
            {
                if(this.steine[xPos-downl][yPos-downl].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }

        //Aufsteigend rechts
        for(int upr = 1; upr <= 3; upr++)
        {
            if(yPos+upr == this.row || xPos+upr == this.column) break;
            if(this.steine[xPos+upr][yPos+upr] != null)
            {
                if(this.steine[xPos+upr][yPos+upr].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }
        return false;
    }

    private boolean checkdiagoleft(int xPos, int yPos, boolean colour)
    {
        //Prüft absteigend rechts(+-) und aufsteigend links(-+) nach 4 gleichen
        int counter = 1;

        //Absteigend rechts
        for(int downr = 1; downr <= 3; downr++)
        {
            if(xPos+downr == this.column || yPos-downr < 0) break;
            if(this.steine[xPos+downr][yPos-downr] != null)
            {
                if(this.steine[xPos+downr][yPos-downr].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }

        //Aufsteigend links
        for(int upl = 1; upl <= 3; upl++)
        {
            if(xPos-upl < 0 || yPos+upl == row) break;
            if(this.steine[xPos-upl][yPos+upl] != null)
            {
                if(this.steine[xPos-upl][yPos+upl].getColour() == colour)
                {
                    counter++;
                    if(counter == 4) return true;
                }
                else break;
            }
            else break;
        }
        return false;
    }
}