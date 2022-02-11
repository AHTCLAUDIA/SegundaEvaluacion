package interfaces.teoria.ediciongrafica;

public class Lápiz extends Herramienta implements Dibujable{

    public Lápiz(int grosor, String color) {
        super(grosor, color);
    }

    @Override
    public void dibujarRecta() {
        System.out.println("recta lápiz");
    }

    @Override
    public void dibujarCurva() {
        System.out.println("curva lápiz");
    }

    @Override
    public void dibujarLibre() {
        System.out.println("libre lápiz");
    }
}
