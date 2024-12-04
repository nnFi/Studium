package Generics;

public class MyList<T>
{
    private Node<T> root;
    private Node<T> last;

    public MyList()
    {
        this.root = new Node<>(null);
        this.last = this.root;
    }

    public void append(T data)
    {
        Node<T> newNode = new Node<>(data);
        last.setnext(newNode);
        last = newNode;
    }

    public int counter()
    {
        int counter = 0;

        Node <T> obj = root.getnext();

        do
        {
            if (obj != null) counter++;
            obj = obj.getnext();
        } while (obj != null);

        return counter;
    }
}
