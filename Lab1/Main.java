import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //zad 1
        System.out.println( getMyName()+" "+getMyAge());

        //zad 2
        double a,b,c,x,y;
        a = in.nextDouble();
        b = in.nextDouble();
        calculator(a,b);
        //zad 3
        a= in.nextDouble();
        System.out.println(czyParzysta(a));
        //zad 4
        a= in.nextDouble();
        System.out.println(czyPodzielna(a));
        //zad 5
        a= in.nextDouble();
        System.out.println(Math.pow(a,3));
        //zad 6
        a= in.nextDouble();
        System.out.println(Math.sqrt(a));
        //zad 7
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println(trojkatProstokatny(a,b));
        }


    //zad 1
    public static String getMyName(){
        return "Filip";
    }
    public static int getMyAge(){
        return 22;
    }
    //zad 2
    public static void calculator(double a, double b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
    //zad 3
    public static boolean czyParzysta(double a){
        if(a%2==0) return true;
        return false;
    }
    //zad 4
    public static boolean czyPodzielna(double a){
        if(a%3==0 && a%5==0) return true;
        return false;
    }
    //zad 7
    public static boolean trojkatProstokatny(double x, double y){
        double a = Math.random() * y + x;
        double b = Math.random() * y + x;
        double c = Math.random() * y + x;
        if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==b*b) return true;
        return false;
        }
    }
}
