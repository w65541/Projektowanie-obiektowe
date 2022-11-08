import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rokB,lPieter;

    public Budynek(String nazwa, int rokB, int lPieter) {
        this.nazwa = nazwa;
        this.rokB = rokB;
        this.lPieter = lPieter;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRokB() {
        return rokB;
    }

    public int getlPieter() {
        return lPieter;
    }

    public int wiek(){
        return LocalDate.now().getYear()-rokB;
    }
}
