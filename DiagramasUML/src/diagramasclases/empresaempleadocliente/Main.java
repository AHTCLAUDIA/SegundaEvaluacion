package diagramasclases.empresaempleadocliente;

public class Main {
    public static void main(String[] args) {
        //Persona persona = new Persona(); -> es abstracta, no se puede instanciar

        /*
        Crea una clase Main con tres empleados: “E. Estévez”, de 18 años,
y “J. Juárez”, de 30, sueldo de 30.000 € y “M. Martínez”, de 40 años,
sueldo de 36.000.
         */

        Empleado empleado1 = new Empleado("E. Estévez", 18);
        Empleado empleado2 = new Empleado("J.Juárez", 30, 30000);
        Empleado empleado3 = new Empleado("M.Martínez", 40, 36000);

        // Muestra los datos de los tres
        System.out.println("*** Creamos tres empleados y mostramos sus datos ***");
        System.out.println("****************************************************");
        empleado1.mostrarDatos();
        empleado2.mostrarDatos();
        empleado3.mostrarDatos();

        //Sube el sueldo del primero a 15.000. Muestra sus datos.
        System.out.println("\nSube el sueldo del primero a 15.000. Muestra sus datos.");
        empleado1.setSueldoBruto(15000);
        empleado1.mostrarDatos();

        // Crea dos clientes y muestra sus datos.
        Cliente cliente1 = new Cliente("C.Corbacho", 25, "912345678");
        Cliente cliente2 = new Cliente("D.Díaz", 45, "912345678");

        System.out.println("\n*** Creamos dos clientes y mostramos sus datos ***");
        System.out.println("****************************************************");
        cliente1.mostrarDatos();
        cliente2.mostrarDatos();
    }
}
