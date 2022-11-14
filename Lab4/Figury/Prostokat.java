package Figury;
import java.lang.Math;

public class Prostokat {
    double a,b;

    public Prostokat(double a, double b) {
        if(a>0 && b>0){
        this.a = a;
        this.b = b;
        }else{
            this.a = 1;
            this.b = 1;
        }
    }

    public double pole(){
        return a*b;
    }

    public double obwod(){
        return (a+b)*2.0;
    }

    public double przekatna(){
        return Math.sqrt((a*a)+(b*b));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void dane(){
        System.out.println("Prostokat");
        System.out.println(getA());
        System.out.println(getB());
        System.out.println(pole());
        System.out.println(obwod());
        System.out.println(przekatna());
    }
}

