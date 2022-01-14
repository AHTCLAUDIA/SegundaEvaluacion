package poo.ejercicios.ejercicio17;

public class Unidad {

    private String nombre;
    static int unidades; // esto es un contador

    public Unidad(String nombre) {
        this.nombre = nombre; // recibe un nombre para la unidad
        // incrementa cada vez el número de unidades.
        unidades++;
    }


    // getters y setters para nombre porque es private
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
