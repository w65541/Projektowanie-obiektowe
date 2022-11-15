package zad1;
public class Prostokat extends Figura{
	double wys=0, szer=0;

	Prostokat(double wys, double szer){
		this.wys = wys;
		this.szer = szer;
			
	}
	public Prostokat(double wys, double szer, String kolor){
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

    double getPowierzchnia() {
        return (szer * wys);
    }

	public void przesun(double a,double b){
		punkt.przesun(a,b);
	}

	public String opis(){
		return "Klasa Prostokat. Kolor: "+kolor+" Wysokosc: "+wys+" Szerokosc: "+szer;
	}
}