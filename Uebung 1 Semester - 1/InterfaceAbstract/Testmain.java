package InterfaceAbstract;

public class Testmain
{
    public static void main(String[] args)
    {
        //Abstrakte Klassen können keine Instanz haben
        //Wenn im ersten Astest anstatt Childtest genommen wird kann nicht auf alle Methoden der Klasse Childtest zugegriffen werden
        //Siehe unten auskommentiert
        //Das gleiche gilt wenn das Interface nicht bei der Oberklasse gesetzt ist
        //Wenn das Ganze funktionieren soll müssen Abstract Methoden in der Oberklasse hinterlegt werden
        Childtest raum1 = new Childtest(5);

        raum1.multiplyLW();
        System.out.println("-----------------------");

        System.out.println(raum1.getLength());
        System.out.println(raum1.multiply());
        System.out.println(raum1.room());
        System.out.println(raum1.getHeigth());

        Astest raum2 = new Childtest(6);
        //System.out.println(raum2.getHeigth());
        System.out.println(raum2.room());
    }
}
