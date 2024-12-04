package Klausurvorbereitung.Vermittler;

public class KollegeA extends Kollege{

    public KollegeA(Vermittler v){
        super(v);
    }
    
    public void info(){
        System.out.println("A wurde über Änderung informiert!");
    }
}
