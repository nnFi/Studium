package Klausurvorbereitung.Vermittler;

public class Vermittler{

    private KollegeA A;
    private KollegeB B;

    public void vermittle(Kollege k) {
        if(k.equals(A)) {
            B.info();
        } else if(k.equals(B)) {
            A.info();
        }
    }

    public void setA(KollegeA AK) {
        this.A = AK;
    }

    public void setB(KollegeB BK) {
        this.B = BK;
    }
}
