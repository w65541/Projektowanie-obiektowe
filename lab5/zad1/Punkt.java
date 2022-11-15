package zad1;

public class Punkt {
    double x,y;

    public Punkt() {
        x=0;
        y=0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        setX(0);
        setY(0);
    }

    public void opis(){
        System.out.println("X: "+getX());
        System.out.println("Y: "+getY());
    }

    public void przesun(double a, double b){
        setX(x+a);
        setY(y+b);
    }
}
