package zad1;
import java.lang.Math;
public class Okrag extends Figura{
    //Punkt srodek;
    double r;

    public Okrag(Punkt s,double r) {
        super(s);
        this.r = r;
    }

    public Okrag(String kolor, double r) {
        super(kolor);
        this.r = r;
    }

    /*
        public Okrag(Punkt srodek, double r) {
            this.srodek = srodek;
            this.r = r;
        }
    */
    public Okrag() {
        super();
        r=0;
    }

    public Punkt getSrodek() {
        return punkt;
    }

    public void setSrodek(Punkt srodek) {
        this.punkt = srodek;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getSrednica(){return 2*r;}
    public double getPole(){return 2*r*Math.PI;}

    public boolean wSrodku(Punkt p){
        if(Math.pow((p.getX()-punkt.getX()),2)+Math.pow((p.getY()-punkt.getY()),2)<=r*r) return true;
        return false;
    }
    public String opis(){
        return "Klasa Okrag. Kolor: "+kolor+" Srodek: ("+getSrodek().getX()+","+getSrodek().getY()+") Promien: "+r;
    }
}
