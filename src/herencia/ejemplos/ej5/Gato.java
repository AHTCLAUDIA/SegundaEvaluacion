package herencia.ejemplos.ej5;

public class Gato extends Mascota{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() {
        System.out.println("miau");
    }
}
