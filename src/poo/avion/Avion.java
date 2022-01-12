package poo.avion;

public class Avion {
    String nombre;
    int aforo;
    int velocidad;
    double coordenadaX;
    double coordenadaY;

    public Avion(String nombre, int aforo, int velocidad, double coordenadaX, double coordenadaY) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.velocidad = velocidad;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void transportar(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void imprimirDatos() {
        System.out.println("Avión: " + this.nombre + ":");
        System.out.println("Aforo: " + this.aforo);
        System.out.println("Velocidad media: " + this.velocidad);
        System.out.println("Posición: " + coordenadaX + ", " + coordenadaY);
    }
}
