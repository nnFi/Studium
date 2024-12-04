package InterfaceAbstract;

public abstract class Astest implements Iftest
{
    private int length, width;

    public Astest(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void multiplyLW() {
        System.out.println(length * width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract  String multiply();
}
