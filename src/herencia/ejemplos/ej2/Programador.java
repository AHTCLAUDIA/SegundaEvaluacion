package herencia.ejemplos.ej2;

import org.demo.A;

import java.util.ArrayList;

public class Programador extends Empleado{
    ArrayList<String> lenguajes = new ArrayList<>(); // declaramos un arraylist de String

    public Programador(String nombre, int añoNacimiento, String dirección) {
        super(nombre, añoNacimiento, dirección);
    }


    public void mostrarDatos() {
        System.out.println(nombre); // heredado de Persona
        System.out.println(fechaContrato); // heredado de Empleado
    }
}
