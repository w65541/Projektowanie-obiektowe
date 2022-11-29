package lab9;

import java.util.Objects;

public class Uczestnik {
    int id,wiek;
    public String imie;

    public Uczestnik(int id, int wiek, String imie) {
        this.id = id;
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wiek, imie);
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "id=" + id +
                ", wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
