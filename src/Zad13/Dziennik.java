package Zad13;

public class Dziennik {
    Student[] lista=new Student[100];

    public Dziennik() {
        for (int i=0;i<100;i++){
            lista[i]=new Student("","","",0,0);
        }
    }
}
