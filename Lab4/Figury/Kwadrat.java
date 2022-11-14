package Figury;

public class Kwadrat {
    double a;

    public Kwadrat(double a) {
        if(a>0){
            this.a = a;
        }else{
            this.a = 1;
        }
    }

    public double pole(){
        return a*a;
    }

    public double obwod(){
        return a*4.0;
    }

    public double przekatna(){
        return Math.sqrt(2)*a;
    }

    public double getA() {
        return a;
    }

    public void dane(){
        System.out.println("Kwadrat");
        System.out.println(getA());
        System.out.println(pole());
        System.out.println(obwod());
        System.out.println(przekatna());
    }
}
