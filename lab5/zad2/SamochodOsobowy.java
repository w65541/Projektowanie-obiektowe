package zad2;

public class SamochodOsobowy extends Samochod{
    double waga=2,pojemnosc=0.8;
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok, int przebieg, double waga, double pojemnosc, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rok, przebieg);
        if(waga>=2 && waga<=4.5)this.waga = waga;
        if(pojemnosc>=0.3 && pojemnosc<=3)this.pojemnosc = pojemnosc;
        this.iloscOsob = iloscOsob;
    }

    public void opis(){
        super.opis();
        System.out.println(waga);
        System.out.println(pojemnosc);
        System.out.println(iloscOsob);
    }
}
