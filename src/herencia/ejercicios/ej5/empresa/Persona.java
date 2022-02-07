package herencia.ejercicios.ej5.empresa;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " + "\nnombre: " + nombre + "\nedad=" + edad;
    }

    public void mostrar() {
        System.out.println(toString());
    }
}
