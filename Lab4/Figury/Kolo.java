package Figury;
import java.lang.Math;
public class Kolo {
    double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double pole(){
        return Math.PI*r*r;
    }

    public double obwod(){
        return Math.PI*r*2;
    }

    public double getR() {
        return r;
    }

    public void dane(){
        System.out.println("Kolo");
        System.out.println(getR());
        System.out.println(pole());
        System.out.println(obwod());
    }
}
