import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //zad 1
        srednia(3);

        //zad 2
        dodatnieIujemene();

        //zad 3
        sumaParzystych(dlugoscCiagu());

        //zad 4
        sumaParzystychLosowych(dlugoscCiagu());

        //zad 5
        System.out.println(czyPalindrom("kaak"));

        }

//lab 3
    //zad 1
    public static void srednia(int n){
        if (n>0) {
            Scanner in = new Scanner(System.in);
            double x = 0.0, i = 0, temp;
            while (i < n) {
                temp = in.nextDouble();
                x += temp;
                i++;
            }
            System.out.println(x/n);
        }else{
            System.out.println("Liczba studentów musi być większa od zera");
        }
    }
    //zad 2
    public static void dodatnieIujemene(){
        int ds=0,dl=0,us=0,ul=0,temp;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<4;i++){
            temp = in.nextInt();
            if(temp>=0){
                ds+=temp;
                dl++;
            }else{
                us+=temp;
                ul++;
            }
        }
        System.out.println("Suma liczb dodatnich: "+ds);
        System.out.println("Ilość liczb dodatnich: "+dl);
        System.out.println("Suma liczb ujemnych: "+us);
        System.out.println("Ilość liczb ujemnych: "+ul);
    }
    //zad 3
    public static int dlugoscCiagu(){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        return n;
    }
    public static void sumaParzystych(int n){
        int ps=0,temp;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++){
            temp = in.nextInt();
            if(temp%2==0) ps+=temp;
        }
        System.out.println("Suma liczb parzystych: "+ps);
    }
    public static boolean czyParzysta(double a){
        if(a%2==0) return true;
        return false;
    }
    //zad 4
    public static void sumaParzystychLosowych(int n){
        int ps=0,temp;
        Random rand = new Random();
        for (int i=0;i<n;i++){
            temp =  rand.nextInt(55)-10;
            if(temp%2==0) ps+=temp;
        }
        System.out.println("Suma liczb parzystych: "+ps);
    }
    //zad 5
    public static boolean czyPalindrom(String s) {
        int l = s.length() - 1;
        s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l)) return false;
            l--;
        }
        return true;
    }
//lab 2
    //zad 1
    public static void rownanieKwadratowe(int a,int b, int c){
        double delta=(b*b)-(4*a*c);
        if(delta>0){
            double x1,x2;
            x1=((-1*b)+Math.sqrt(delta))/(2*a);
            x2=((-1*b)-Math.sqrt(delta))/(2*a);
            System.out.println(x1+" "+x2);
        }
        if(delta==0) System.out.println((-1*b)/(2*a));
        if(delta<0)   System.out.println("Nie ma miejsc zerowych");
    }
    //zad 2
    public static double a(double x){
        if(x>0) return 2*x;
        if(x==0) return 0;
        return -3*x;
    }
    public static double b(double x){
        if(x>=1) return x*x;
        return x;
    }
    public static double c(double x){
        if(x>2) return 2+x;
        if(x==2) return 8;
        return x-4;
    }

    //zad 3
    public static void sortowanie(double x, double y, double z){
        if(x>=y){
            if(x>=z){
                if (y>=z){
                    System.out.println(x+" "+y+" "+z);
                }else{System.out.println(x+" "+z+" "+y);}
            }else{
                System.out.println(z+" "+x+" "+y);
            }
        } else if (y>=z) {
            if (x>=z){
                System.out.println(y+" "+x+" "+z);
            }else{System.out.println(y+" "+z+" "+x);}

        }else {System.out.println(z+" "+y+" "+x);}
    }

    //zad 4
    public static void pogodaBool(boolean bus,boolean sun){
        if(bus){
            System.out.println("Dostaniesz się na uczelnie");
        }else {System.out.println("Nie dostaniesz się na uczelnię");}
        if(sun){
            System.out.println("Miłego dnia " +
                    "i pięknej pogody");
        }else if(bus){System.out.println("Weź parasol");}
    }
    public static void pogoda(boolean bus,boolean sun){
        if(bus==true && sun==true){
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }else {System.out.println("Nie dostaniesz się na uczelnię");}
        if(sun){
            System.out.println("Miłego dnia " +
                    "i pięknej pogody");
        }else if(bus){System.out.println("Weź parasol");}
    }
    }

