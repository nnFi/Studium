package ArrayStack;

public class StackFullException extends StackException {
    private int size;

    public StackFullException(String message, int size) {
        super(message);
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}
