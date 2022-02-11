package interfaces.teoria.ejemplos;

public class Clase implements Interfaz{
    @Override
    public void metodoAbstracto() {
        System.out.println("método abstracto implementado en la clase");
    }

    // si quiero, puedo sobreescribir otros métodos no abstractos (salvo privados)

    @Override
    public void métodoPorDefecto() {
        System.out.println("método por defecto sobreescrito porque yo quiero");
    }
}
