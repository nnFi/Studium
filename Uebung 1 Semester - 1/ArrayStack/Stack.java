package ArrayStack;

public interface Stack<T> {

    boolean push(T element) throws StackFullException;
    T pull() throws StackException;
    boolean full();
}