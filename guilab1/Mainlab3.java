import java.util.Arrays;
import java.util.Random;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
    sumaSrednia(tablicaRandom(10));
    coDrugi(tablicaRandom(4));
    coDrugi(tablicaRandom(5));
    coDrugi(tablicaRandom(6));
    String[] s={"aaa", "aBa","CCc"};
        String[] ss={"aaa", "aBas","CCc"};
    wielkieLitery(s);
    odKonca(tablicaString());
    sortowanie(tablicaRandom(15));
    //silnia(tablicaInt());
        czyTakieSame(s,ss);
    }
//zad 1
    public static int[] tablicaRandom(int n){
        int[] t;
        if(n>=0){
        t = new int[n];
        Random rand = new Random();
        for (int i=0;i<n;i++){
            t[i]= rand.nextInt(100);
        }
        return t;
        }
        t=new int[0];
        return t;
    }
    public static void sumaSrednia(int[] t){
        int sum=0;
        //wersja foreach
        for (int i:
             t) {
            sum+=i;
        }
        /*
        //wersja z for
        for (int i;i<t.length;i++){
            sum+=t[i];
        }
        */
        double avr=(sum*1.0)/(t.length*1.0);
        System.out.println("Suma: "+sum+" Średnia: "+avr);
    }
    //zad 2
    public static void  coDrugi(int[] t){
        for (int i=1;i<t.length;i+=2){
            System.out.print(t[i]+" ");
        }
        System.out.println();
    }
    //zad 3
    public static void wielkieLitery(String[] t){
        for (String i:
             t) {
            System.out.println(i.toUpperCase());
        }
    }
    //zad 4
    public static String[] tablicaString(){
        Scanner in = new Scanner(System.in);
        String[] t;
        t= new String[5];
        for (int i=0;i<5;i++){t[i]=in.next();}
        return t;
    }
    public static void odKonca(String[] t){
        for (int i=4;i>=0;i--){
            for (int j=t[i].length()-1;j>=0;j--){
                System.out.print(t[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    //zad 5
    public static int[] tablicaInt(){
        Scanner in = new Scanner(System.in);
        int[] t=new int[5];
        for (int i=0;i<5;i++){t[i]=in.nextInt();}
        return t;
    }

    public static void sortowanie(int[] t){
        int temp;
        for(int i=0;i<t.length;i++){
            for (int j=i+1;j<t.length;j++){
                if(t[j]<t[i]){
                    temp=t[j];
                    t[j]=t[i];
                    t[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(t));
    }
    //zad 6
    public static void silnia(int[] t){
        int temp;
        for (int i:
             t) {
            temp=1;
            for (int j=1; j<=i;j++){
                temp*=j;
            }
            System.out.println(temp);
        }
    }
    //zad 7
    public static void czyTakieSame(String[] a,String[] b){
        if(a.length!=b.length){
            System.out.println("Różne");
            return;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                System.out.println("Różne");
                return;
            }
        }
        System.out.println("Takie same");
    }
}