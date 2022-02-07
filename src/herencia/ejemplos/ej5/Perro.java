package herencia.ejemplos.ej5;

public class Perro extends Mascota{
    boolean vaAPorLaPelota;

    public Perro(String nombre, int edad, boolean vaAPorLaPelota) {
        super(nombre, edad);
        this.vaAPorLaPelota = vaAPorLaPelota;
    }

    @Override
    public void dice() {
        System.out.println("guau");
    }

    // no sobreescribimos toString()
}
