public class Gatunek {
    String nazwaR,nazwaG,opis;
    int liczba2n,liczbaX;

    public Gatunek(String nazwaR, String nazwaG, String opis, int liczba2n, int liczbaX) {
        this.nazwaR = nazwaR;
        this.nazwaG = nazwaG;
        this.opis = opis;
        this.liczba2n = liczba2n;
        this.liczbaX = liczbaX;
    }

    public void nazwa(){
        System.out.println(nazwaR+" "+nazwaG);
    }
    public void dane(){
        System.out.println(nazwaR);
        System.out.println(nazwaG);
        System.out.println(opis);
        System.out.println(liczba2n);
        System.out.println(liczbaX);
    }

    public void chromosomy(){
        System.out.println(liczba2n/2);
    }

    public Gatunek klon(){
        Gatunek klon=new Gatunek( nazwaR,  nazwaG,  opis,  liczba2n,  liczbaX);
        return klon;
    }
}
