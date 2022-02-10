package diagramasclases.empresaempleadocliente;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();


//    Constructor solamente con el nombre de la empresa.

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

//▪ Métodos para añadir y quitar empleados y clientes.
public void añadirEmpleado(Empleado e) {
    empleados.add(e);
}

    public void quitarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    public void añadirCliente(Cliente c) {
        clientes.add(c);
    }

    public void quitarCliente(Cliente c) {
        clientes.remove(c);
    }
//▪ Métodos para mostrar empleados y clientes.
    public void mostrarEmpleados() {
        System.out.println("Empleados de la empresa " + nombre);
        System.out.println("===================================");
        for (Empleado elem: empleados) {
            System.out.println(elem.nombre);
        }
    }

    public void mostrarClientes() {
        System.out.println("Clientes de la empresa " + nombre);
        System.out.println("===================================");
        for (Cliente elem: clientes) {
            System.out.println(elem.nombre);
        }
    }

//▪ Crea una empresa en Main con todos los objetos anteriores, y
//muestra sus datos.
//▪ Quita un cliente y despide a un empleado. Muestra sus datos.
//

}
