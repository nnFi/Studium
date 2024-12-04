package ArrayStack;

public class ArrayStack<T> implements Stack<T> {

    private int size;
    private int index;
    T[] data;

    @SuppressWarnings("unchecked")

    public ArrayStack(int size)
    {
        this.size = size;
                    this.index = 0;
        data = (T[])(new Object[size]);
    }

    //Getter
    public int getsize() {
        return this.size;
    }

    public int getindex() {
        return this.index;
    }

    public boolean push(T element) throws StackFullException {
        //Array voll
        if(this.index == this.size) {
            throw new StackFullException("Test",5);
        }
        else {
            data[index] = element;
            index ++;
            return true;
        }
    }

    public T pull() throws StackEmptyException {
        //Fehler Array leer
        index--;
        T obj = null;
        try {
            obj = data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new StackEmptyException("Array ist leer");
        }
        return obj;
    }

    public boolean full() {
        return this.index == this.size?true:false;
    }
}
