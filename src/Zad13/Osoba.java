package Zad13;
public class Osoba {
    String imie="q",nazwisko="q";
    int wiek=-1;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba() {
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void dane(){
        if (imie!="q") System.out.println(imie);
        if (nazwisko!="q") System.out.println(nazwisko);
        if (wiek!=-1) System.out.println(wiek);
    }
}
