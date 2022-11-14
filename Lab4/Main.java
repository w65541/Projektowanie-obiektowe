import Zad13.Dziennik;

public class Main {
    public static void main(String[] args) {
        Budynek bud= new Budynek("a",1990,3);

        System.out.println(bud.wiek());
        Dziennik dzien=new Dziennik();
        dzien.wprowadzDomyslne();
        dzien.daneStudenta(2);
        dzien.daneWszyscy();
        dzien.edytujImie(2,"Janusz");
        dzien.daneWszyscy();
    }
}