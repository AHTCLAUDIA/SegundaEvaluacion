package diagramasclases.empresaempleadocliente;

import java.util.ArrayList;

public class Directivo extends Empleado{
    private int categoria;
    ArrayList<Empleado> empleados = new ArrayList<>();

    // Constructor recibe e inicializa todos los parámetros del directivo.
    // Consideramos que no metemos aquì los empleados, los añadimos luego
    public Directivo(String nombre, int edad, float sueldoBruto, int categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    // Métodos para cambiar categoría y, por tanto, el sueldo.
    public void setCategoria(int categoria, float sueldo) {
        this.categoria = categoria;
        this.setSueldoBruto(sueldo);
    }

    // Métodos para añadir y quitar empleados a su cargo.
    public void añadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void quitarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    @Override
    public String toString() {
        return "Directivo:" +
                "\n* nombre: '" + nombre + '\'' +
                "\n* edad: " + edad +
                "\n* sueldoBruto: " + getSueldoBruto() + " €" +
                "\n* sueldoNeto=" + calcularSueldoNeto() + " €" +
                "\n* categoría=" + categoria +
                "\nEmpleados a su cargo: " +
                "\n====================" + empleados;
    }

    @Override
    public void mostrarDatos() {
        // super.mostrarDatos();
        System.out.println(toString());
    }

}
