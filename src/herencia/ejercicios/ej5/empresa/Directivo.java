package herencia.ejercicios.ej5.empresa;

public class Directivo extends Empleado{
    Categoria categoria;

    public Directivo(String nombre, int edad, double sueldoBruto, Categoria categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Persona: " + "\nnombre: " + nombre + "\nedad=" + edad +
                "\nEmpleado: sueldo " + sueldoBruto + "\nDirectivo{" +
                "categoria=" + categoria +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println(toString());;
    }
}
