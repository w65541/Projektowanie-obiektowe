package lab8zad2;

public class Silnia {
    public int silnia(int x) throws BlednaWartoscDlaSilniException {
        if(x<0) throw new BlednaWartoscDlaSilniException("Liczba ujemna");
        if(x<=1) return x*silnia(x-1);
        return 1;
    }

}
