package Generics;

import MeineTestKlassen.Animal;
import MeineTestKlassen.PersonName;

public class genericTest
{
    public static void main(String[] args)
    {
        //Generics definieren ein Objekt von unbekanntem Typ
        System.out.println("Start");
        
        PersonName eins = new PersonName("Finn");
        PersonName zwei = new PersonName("Greta");
        PersonName drei = new PersonName("Luisa");

        MyList<PersonName> list = new MyList<>();

        list.append(eins);
        list.append(zwei);
        list.append(drei);
        printer.<Integer>print(list.counter());

        MyList<Animal> liste = new MyList<>();
        Animal teins = new Animal("Affe",1);
        Animal tzwei = new Animal("Giraffe",1);

        liste.append(teins);
        liste.append(tzwei);
        printer.<Integer>print(liste.counter());

        System.out.print("Ende");
    }
}
