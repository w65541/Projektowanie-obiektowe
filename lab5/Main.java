import zad1.*;
import zad2.*;

public class Main {
    public static void main(String[] args) {
        Prostokat p=new Prostokat(2,3,"czerwony");
        System.out.println(p.opis());
        Trojkat t=new Trojkat(2,3,"czerwony");
        System.out.println(t.opis());
        Kwadrat k=new Kwadrat(2,"niebieski");
        System.out.println(k.opis());
        Okrag o=new Okrag("zielony",2);
        System.out.println(o.opis());

        Samochod s1=new Samochod("a","b","c","d",2000,0);
        SamochodOsobowy so=new SamochodOsobowy("a","b","c","d",2000,0,3,3,4);
        Samochod s2=new Samochod(so);
        s1.opis();
        so.opis();
        s2.opis();
    }
}