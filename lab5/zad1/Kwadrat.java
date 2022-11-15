package zad1;

public class Kwadrat extends Prostokat{
    public Kwadrat(double a,String kolor) {
        super(a, a, kolor);
    }
    public Kwadrat(double a) {
        super(a, a);
    }
    public double getBok(){
        return wys;
    }

    public void setBok(double a){
        wys=a;
        szer=a;
    }
    public String opis(){
        return "Klasa Kwadrat. Kolor: "+kolor+" Bok: "+wys;
    }
}
