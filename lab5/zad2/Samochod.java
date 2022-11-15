package zad2;

public class Samochod {
    String marka,model,nadwozie,kolor;
    int rok,przebieg=0;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rok = rok;
        if(przebieg>=0) this.przebieg = przebieg;
    }
    public Samochod(Samochod s) {
        this.marka = s.marka;
        this.model = s.model;
        this.nadwozie = s.nadwozie;
        this.kolor = s.kolor;
        this.rok = s.rok;
        if(s.przebieg>=0)this.przebieg = s.przebieg;
    }
    public void opis(){
        System.out.println(marka);
        System.out.println(model);
        System.out.println(nadwozie);
        System.out.println(kolor);
        System.out.println(rok);
        System.out.println(przebieg);
    }


}
