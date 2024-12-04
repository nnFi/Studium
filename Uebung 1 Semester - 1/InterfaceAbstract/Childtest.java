package InterfaceAbstract;

public class Childtest extends Astest
{
    private int heigth;

    public Childtest(int heigth)
    {
        super(2,3);
        this.heigth = heigth;
    }

    public int getHeigth()
    {
        return heigth;
    }

    public void setHeigth(int heigth)
    {
        this.heigth = heigth;
    }

    public String multiply()
    {
        return "Fläche:" + this.getWidth() * this.getLength();
    }

    //Kann nicht aufgerufen werden
    public String room()
    {
        return "Volumen:" + this.getWidth() * this.getLength() * this.heigth;
    }
}
