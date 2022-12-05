import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lab9.Uczestnik;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args){


        ArrayList<Uczestnik> l= new ArrayList<>();
        l.add(new Uczestnik(1,18,"A"));
        l.add(new Uczestnik(2,17,"B"));
        //lab 9 zad1
        Predicate<Uczestnik> condition = uczestnik -> uczestnik.getWiek()<18;
        l.removeIf(condition);
        //System.out.println(l.toString());
//lab 9 zad 2
        Uczestnik[] a=new Uczestnik[3];
        a[0]=new Uczestnik(1,18,"A");
        a[1]=new Uczestnik(2,18,"A");
        a[2]=new Uczestnik(3,18,"A");
        List b=new ArrayList<Uczestnik>();
        b.add(a[0]);
        b.add(a[1]);
        b.add(a[2]);
        System.out.println(b.subList(0,2).toString());
        b.subList(0,2).clear();
        System.out.println(b.toString());
        //zad 3
        List int1=new ArrayList<Integer>();
        List int2=new ArrayList<Integer>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        ListIterator<Integer> iterator= int1.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()){
            int2.add(iterator.previous());
        }
        System.out.println(int2.toString());
    }
}