package Figury;

public class Szescian {
    double a;

    public Szescian(double a) {
        if(a>0){
            this.a = a;
        }else{
            this.a = 1;
        }
    }

    public double pole(){
        return a*a*6;
    }

    public double objetosc(){
        return Math.pow(a,3);
    }

    public double getA() {
        return a;
    }

    public void dane(){
        System.out.println("Szescian");
        System.out.println(getA());
        System.out.println(pole());
        System.out.println(objetosc());
    }
}
