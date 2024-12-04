package ArrayStack;

import MeineTestKlassen.Person;

public class Programm {
    public static void main(String[] args) throws StackException {
        ArrayStack<Person> meineListe = new ArrayStack<>(3);

        //Person test = meineListe.pull();

        Person p1 = new Person(5, "Peter");
        Person p2 = new Person(6, "Heinz");
        Person p3 = new Person(7, "Achim");
        Person p4 = new Person(8, "Olaf");
        Person p5 = new Person(9, "Heinz");

        boolean pushed;

        pushed = meineListe.push(p1);
        pushed = meineListe.push(p2);
        pushed = meineListe.push(p3);
        pushed = meineListe.push(p4);
        pushed = meineListe.push(p5);

        System.out.println(pushed);

        //HIER SOLLTE EIN ERROR KOMMEN

        /**
        System.out.println(meineListe.full());
        System.out.println(pushed);

        //p1
        Person p6 = meineListe.pull();

        System.out.println(meineListe.getindex());
        //p2
        Person p7 = meineListe.pull();
        System.out.println(meineListe.getindex());
        //p3
        Person p8 = meineListe.pull();
        System.out.println(meineListe.getindex());
        //p4
        Person p9 = meineListe.pull();
        System.out.println(meineListe.getindex());

        System.out.println(p6.getAlter() + p7.getAlter() + p8.getAlter() + p9.getAlter());
        */
    }
}