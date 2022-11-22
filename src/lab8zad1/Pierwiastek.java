package lab8zad1;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Pierwiastek {
    public void pierwiastek(){
        try {
            Scanner in = new Scanner(System.in);
            double x;
            x=in.nextDouble();
            if(x<0)throw new IllegalArgumentException("Liczba ujemna");
            System.out.println(Math.sqrt(x));

        }catch (InputMismatchException x){
            System.out.println("Nie liczba");
        }
    }
}
