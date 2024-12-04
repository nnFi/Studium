package JUnitTest;

public class Telefon {
    private String model;
    private boolean eingeschaltet;
    private boolean ausgeschaltet;

    public Telefon(String model) {
        this.model = model;
        this.eingeschaltet = false;
        this.ausgeschaltet = true;
    }

    public void setModel(String model) throws Exception {
        if(model.length()<4) {
            if(model.length()==3){
                throw new Length3("Länge darf nicht 3 sein!");
            } else throw new InvalidLength("Länge ist " + model.length() + "muss aber mindestens 4 sein!");
        } else this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void einschalten() {
        this.eingeschaltet = true;
    }

    public void ausschalten() {
        this.ausgeschaltet = true;
    }

    public boolean getEingeschaltet() {
        return eingeschaltet;
    }

    public boolean getAusgeschaltet() {
        return ausgeschaltet;
    }

    private int rechner(int i, int a) {
        return i+a;
    }
}
