package Generics;

public class Node<T>
{
    /**
    T data ist ein Feld in der Klasse Node<T>, das die Daten des Knotens speichert. 
    In der LinkedList-Klasse werden die Daten der Knoten durch das Datenfeld des jeweiligen Knotens repräsentiert.
    --> T nimmt z.B. Person an

    Node<T> next ist ein Feld in der Klasse Node<T>, das auf den nächsten Knoten in der LinkedList zeigt. 
    Jeder Knoten in der LinkedList hat ein nächstes Knotenfeld, das auf den nächsten Knoten in der LinkedList zeigt.
    --> Verweis auf die Klasse selbst
     */
    private T data;
    private Node<T> next;

    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }

    //Getter
    public Node<T> getnext()
    { 
        return this.next;
    }

    public T getdata()
    {
        return this.data;
    }

    //Setter
    public void setnext(Node<T> data)
    {
        this.next = data;
    }

}
