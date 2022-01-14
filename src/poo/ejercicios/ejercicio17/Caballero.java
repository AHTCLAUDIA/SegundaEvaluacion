package poo.ejercicios.ejercicio17;

public class Caballero {
    private String nombre;
    static int caballeros;

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
