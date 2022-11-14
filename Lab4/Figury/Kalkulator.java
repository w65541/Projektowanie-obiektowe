package Figury;
import java.util.Scanner;
public class Kalkulator {
    public Kalkulator() {
    }
    public void oblicz(){
        Scanner in = new Scanner(System.in);
        int i;
        double a,b,c;
        i=in.nextInt();
        switch (i){
            case 0:
                a=in.nextDouble();
                Kolo x0=new Kolo(a);
                x0.dane();
            case 1:
                a=in.nextDouble();
                Kwadrat x1=new Kwadrat(a);
                x1.dane();
            case 2:
                a=in.nextDouble();
                b=in.nextDouble();
                Prostokat x2=new Prostokat(a,b);
                x2.dane();
            case 3:
                a=in.nextDouble();
                b=in.nextDouble();
                c=in.nextDouble();
                Prostopadloscian x3=new Prostopadloscian(a,b,c);
                x3.dane();
            case 4:
                a=in.nextDouble();
                b=in.nextDouble();
                Stozek x4=new Stozek(a,b);
                x4.dane();
            case 5:
                a=in.nextDouble();
                Szescian x5=new Szescian(a);
                x5.dane();
        }
    }
}
