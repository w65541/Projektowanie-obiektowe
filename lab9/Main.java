import lab7zad1.Samolot;
import lab7zad1.Statek;
import lab7zad2.Wieloryb;
import lab8zad1.Pierwiastek;
import lab8zad2.BlednaWartoscDlaSilniException;
import lab8zad2.Silnia;
import lab8zad3.Adres;
import lab8zad3.NieprawidlowyAdresException;
import lab9.Uczestnik;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws BlednaWartoscDlaSilniException, NieprawidlowyAdresException {
        Samolot samolot=new Samolot();
        Statek statek=new Statek();
        samolot.lec();
        statek.plyn();

        Wieloryb wieloryb=new Wieloryb();
        wieloryb.jedz();
        wieloryb.wynurz();

        Pierwiastek pierwiastek=new Pierwiastek();
        //pierwiastek.pierwiastek();
        Silnia silnia=new Silnia();
        silnia.silnia(3);
        //silnia.silnia(-1);
        //Adres a=new Adres("a",null,"b",-1);
        ArrayList<Uczestnik> l= new ArrayList<>();
        l.add(new Uczestnik(1,18,"A"));
        l.add(new Uczestnik(2,17,"B"));
        //lab 9 zad1
        Predicate<Uczestnik> condition = uczestnik -> uczestnik.getWiek()<18;
        l.removeIf(condition);
        System.out.println(l.toString());

    }
}