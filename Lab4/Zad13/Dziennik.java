package Zad13;

public class Dziennik {
    Student[] lista=new Student[100];

    public Dziennik() {
    }

    public void wprowadzDomyslne() {
        for (int i=0;i<100;i++){
        lista[i]=new Student("","","",0,0);
        }
    }

    public void wprowadzStudenta(int i,String imie,String nazw,String spec,int indeks,int rok){
        if(i<100 && 0<=i) lista[i]=new Student(imie,nazw,spec,indeks,rok);
    }

    public void edytujImie(int i, String imie){
        lista[i].setImie(imie);
    }
    public void edytujNazwisko(int i, String nazwisko){
        lista[i].setNazwisko(nazwisko);
    }
    public void edytujSpecjalnosc(int i, String spec){
        lista[i].setSpecjalnosc(spec);
    }
    public void edytujIndeks(int i,int indeks){
        lista[i].setIndeks(indeks);
    }
    public void edytujRok(int i,int rok){
        lista[i].setIndeks(rok);
    }

    public void usunStudenta(int i){
        lista[i]=new Student("","","",0,0);
    }

    public void daneStudenta(int i){
        lista[i].dane();
    }

    public void daneWszyscy(){
        for (int i=0;i<100;i++){
            if(!lista[i].isDefault()){
            System.out.println("Student "+i);
            lista[i].dane();
            }
        }
    }
    public void daneZakresy(int a,int b){
        if(a>0 && b<101){
        for (int i=a-1;i<b;i++){
            if(!lista[i].isDefault()){
                System.out.println("Student "+i);
                lista[i].dane();
            }
        }
        }
    }
}
