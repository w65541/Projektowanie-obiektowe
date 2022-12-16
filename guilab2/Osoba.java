import java.time.LocalDate;

public class Osoba {
    String imie,email,telefon,adres;
    LocalDate data;

    public Osoba(String imie, String email, String telefon, String adres, String data) {
        this.imie = imie;
        this.email = email;
        this.telefon = telefon;
        this.adres = adres;
        this.data = LocalDate.parse(data);
    }
    public Osoba(String imie, String email, String telefon, String adres) {
        this.imie = imie;
        this.email = email;
        this.telefon = telefon;
        this.adres = adres;
    }
    @Override
    public String toString() {
        return imie;
    }
}
