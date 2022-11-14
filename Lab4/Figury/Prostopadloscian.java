package Figury;

public class Prostopadloscian {
    double a,b,c;

    public Prostopadloscian(double a, double b,double c) {
        if(a>0 && b>0){
            this.a = a;
            this.b = b;
            this.c = c;
        }else{
            this.a = 1;
            this.b = 1;
            this.c = 1;
        }
    }

    public double pole(){
        return (a*b*2)+(a*c*2)+(c*b*2);
    }

    public double objetosc(){
        return a*b*c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void dane(){
        System.out.println("Prostokat");
        System.out.println(getA());
        System.out.println(getB());
        System.out.println(getC());
        System.out.println(pole());
        System.out.println(objetosc());

    }
}
