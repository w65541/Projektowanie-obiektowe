package Figury;

public class Stozek {
    double r,h;

    public Stozek(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double pole(){
        return (Math.PI*r*r)+(Math.sqrt((r*r)+(h*h))*Math.PI*r);
    }

    public double objetosc(){
        return (Math.PI*r*r*h)/3.0;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public void dane(){
        System.out.println("Kolo");
        System.out.println(getR());
        System.out.println(getH());
        System.out.println(pole());
        System.out.println(objetosc());
    }
}
