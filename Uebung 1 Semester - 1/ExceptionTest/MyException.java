package ExceptionTest;

public class MyException extends Excpt{
    private int testint;

    public MyException(String message, int testint) {
        super(message);
        this.testint = testint;
    }

    public MyException(String message) {
        super(message);
    }

    public int gettestint() {
        return this.testint;
    }

    @Override
    public String getMessage() {
        return "MyException: " + super.getMessage() + " (" + this.testint + ")";
    }

    public String getError() {
        return "MyException: " + super.getMessage();
    }
}
