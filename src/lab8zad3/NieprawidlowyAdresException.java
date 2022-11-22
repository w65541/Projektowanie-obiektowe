package lab8zad3;

public class NieprawidlowyAdresException extends Throwable {
    public NieprawidlowyAdresException(String ulica, String kodPocztowy, String miasto, int numerDomu) {

        String message="";
        if(ulica==null) message+="Ulica nie może być nullem. ";
        if(miasto==null) message+="Miasto nie może być nullem. ";
        if(kodPocztowy==null) message+="Kod Pocztowy nie może być nullem. ";
        if(numerDomu<=0) message+="Numer domu musi być większy od zera";
        //System.out.println(message);

        Throwable a=new  Throwable(message);
    }
}
