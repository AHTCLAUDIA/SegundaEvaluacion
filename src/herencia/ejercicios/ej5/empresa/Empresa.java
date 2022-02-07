package herencia.ejercicios.ej5.empresa;

import java.util.ArrayList;

public class Empresa {
    String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Cliente> cliente = new ArrayList<>();

    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Cliente> cliente) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                "\nEMPLEADOS:\n" + empleados +
                "\nCLIENTES\n" + cliente +
                '}';
    }

    public void mostrar() {
        System.out.println(toString());;
    }
}
