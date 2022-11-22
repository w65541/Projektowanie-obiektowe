import lab7zad1.Samolot;
import lab7zad1.Statek;
import lab7zad2.Wieloryb;
import lab8zad1.Pierwiastek;
import lab8zad2.BlednaWartoscDlaSilniException;
import lab8zad2.Silnia;
import lab8zad3.Adres;
import lab8zad3.NieprawidlowyAdresException;

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
        Adres a=new Adres("a",null,"b",-1);
    }
}