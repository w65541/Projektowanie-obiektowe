package lab7zad2;

public class Wieloryb extends Ryba{

    public void plyn(){
        System.out.println("pływa");
    }

    @Override
    public void wynurz() {
        System.out.println("wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("zanurza się");
    }

    public void jedz(){
        System.out.println("je plankton");
    }
    public void wydalaj(){
        System.out.println("wydala");
    }
}
