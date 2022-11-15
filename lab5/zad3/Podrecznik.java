package zad3;

public class Podrecznik extends Ksiazka{
    String dziedzina;

    public Podrecznik(String tytul, String autor, String dziedzina) {
        super(tytul, autor);
        this.dziedzina = dziedzina;
    }
}
