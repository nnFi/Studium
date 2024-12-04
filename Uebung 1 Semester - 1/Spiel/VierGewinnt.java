package Spiel;
import edu.princeton.cs.introcs.StdIn;

public class VierGewinnt
{
    public static void main(String[] args)
    {
        System.out.println("Hallo zum Spiel Vier-Gewinnt!");
        Spielfeld feld = new Spielfeld(6, 7);
        feld.zeichne();
        boolean ende = false; //Beendet das Spiel wenn true
        boolean istAmZug = true; //Rot fängt immmer an

        do
        {
            System.out.println((istAmZug == true ? "Rot" : "Gelb") + " ist am Zug.");

            boolean gesetzt = false;
            int column = 0;

            do
            {
                System.out.println("In welche Spalte wollen Sie den Stein legen:");
                column = StdIn.readInt();
                gesetzt = feld.setzestein(column, istAmZug);
            }while(!gesetzt);

            ende = feld.checkwinner(column, istAmZug);
            ende = feld.getfields() == 0 && ende == false ? true : ende;

            if(ende == true)
            {
                System.out.println((istAmZug ? "Rot" : "Gelb") + " hat gewonnen!");
                boolean newGame = false;
                do {
                    System.out.print("Wollen Sie eine neue Runde spielen? (y/n)");
                    String newRound = StdIn.readString();

                    if(newRound.equalsIgnoreCase("y"))
                    {
                        feld.neuesspiel();
                        istAmZug = true;
                        newGame = true;
                        ende = false;
                    }
                    else newGame = newRound.equalsIgnoreCase("n") ? true : false;
                } while(!newGame);

            }
            else
            {
                istAmZug = istAmZug == true ? false : true;
            }
        }while(!ende);
        System.out.println("Spiel beendet!");
    }
}