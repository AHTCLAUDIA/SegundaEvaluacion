package herencia.ejemplos.ej2;

import org.demo.A;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programador extends Empleado{
    ArrayList<String> lenguajes = new ArrayList<>(); // declaramos un arraylist de String

    public Programador(String nombre, int añoNacimiento, String dirección, LocalDate fechaContrato, long salario, ArrayList<String> lenguajes) {
        super(nombre, añoNacimiento, dirección, fechaContrato, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "fechaContrato=" + fechaContrato +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                ", lenguajes=" + lenguajes +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}
