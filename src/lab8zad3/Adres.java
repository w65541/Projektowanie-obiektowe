package lab8zad3;

public class Adres {
    String ulica,kodPocztowy,miasto;
    int numerDomu;

    public Adres(String ulica, String kodPocztowy, String miasto, int numerDomu) throws NieprawidlowyAdresException {
        if(ulica==null ||
        miasto==null ||
        kodPocztowy==null ||
        numerDomu<=0)throw new NieprawidlowyAdresException(ulica,kodPocztowy,miasto,numerDomu);
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
    }
}
