package poo.ejercicios.ejercicio17;

public class General {
    private String nombre;
    static int generales;

    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
