package zad3;

public class Ksiegarnia {
    Ksiazka[] ksiengozbior;
    Klient[] klienci;

    public Ksiegarnia(int a,int b) {
        this.ksiengozbior=new Ksiazka[a];
        this.klienci=new Klient[b];
    }
}
