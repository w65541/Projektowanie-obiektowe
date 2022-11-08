package Zad13;

public class Student {
    String imie="q",nazwisko="q",specjalnosc="q";
    int indeks=-1,rok=-1;

    public Student(String imie, String nazwisko, String specjalnosc, int indeks, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalnosc = specjalnosc;
        this.indeks = indeks;
        this.rok = rok;
    }

    public Student(int indeks) {
        this.indeks = indeks;
    }

    public Student(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public Student(String specjalnosc, int indeks, int rok) {
        this.specjalnosc = specjalnosc;
        this.indeks = indeks;
        this.rok = rok;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getSpecjalnosc() {
        return specjalnosc;
    }

    public int getIndeks() {
        return indeks;
    }

    public int getRok() {
        return rok;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setSpecjalnosc(String specjalnosc) {
        this.specjalnosc = specjalnosc;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void dane(){
        if (getImie()!="q") System.out.println(getImie());
        if (getNazwisko()!="q") System.out.println(getNazwisko());
        if (getSpecjalnosc()!="q") System.out.println(getSpecjalnosc());
        if (getIndeks()!=-1) System.out.println(getIndeks());
        if (getRok()!=-1) System.out.println(getRok());
    }
}
