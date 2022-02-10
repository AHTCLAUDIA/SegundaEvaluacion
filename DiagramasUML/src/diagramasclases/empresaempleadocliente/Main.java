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

        /*
        En la clase Main, crea un directivo (“N. Navarro”, 50, 40.000, 3). y
pon bajo su gestión a los tres empleados anteriores. Muestra sus
datos.
         */

        System.out.println("\n*** Creamos un directivo ***");
        System.out.println("\n*******************************");
        Directivo jefe = new Directivo("N. Navarro", 50, 40000, 3);
        System.out.println();
        System.out.println("\n*** Le asignamos empleados ***");
        System.out.println("\n*******************************");
        jefe.añadirEmpleado(empleado1);
        jefe.añadirEmpleado(empleado2);
        jefe.añadirEmpleado(empleado3);
        jefe.mostrarDatos();

        System.out.println("\n*** Ponemos a este directivo como jefe en todos los empleados creados ***");
        System.out.println("\n*************************************************************************");
        //empleado1.setJefe(jefe);
        //empleado2.setJefe(jefe);
        //empleado3.setJefe(jefe);
        //System.out.println("Probamos...");
        //empleado1.getJefe();

        /*
        Crea un nuevo directivo (“O. Ortiz”, 28, 3000, 5). Quita a uno de los
empleados del otro directivo y asígnalo a este.
         */
        System.out.println("\n*** Creamos otro directivo ***");
        System.out.println("\n*******************************");
        Directivo jefe2 = new Directivo("O. Ortiz", 28, 30000, 5);
        // quitamos del otro al empleado1

        System.out.println("\n*** Quitamos empleado1 del primer directivo y lo asignamos al segundo ***");
        System.out.println("\n*************************************************************************");
        jefe.quitarEmpleado(empleado1);
        jefe2.añadirEmpleado(empleado1);
        jefe.mostrarDatos();
        jefe2.mostrarDatos();

        /*
        Crea una empresa en Main con todos los objetos anteriores, y
muestra sus datos.
         */
        System.out.println("\n*** Creamos una empresa ***");
        System.out.println("\n*******************************");
        Empresa lcc = new Empresa("LCC");
        lcc.añadirEmpleado(empleado1);
        lcc.añadirEmpleado(empleado2);
        lcc.añadirEmpleado(empleado3);
        lcc.añadirEmpleado(jefe);
        lcc.añadirEmpleado(jefe2);
        lcc.mostrarEmpleados();

        lcc.añadirCliente(cliente1);
        lcc.añadirCliente(cliente2);
        lcc.mostrarClientes();
        System.out.println();
        /*
        Quita un cliente y despide a un empleado. Muestra sus datos.
         */
        System.out.println("\n*** Quitamos un empleado y un cliente ***");
        System.out.println("\n*******************************");
        lcc.quitarCliente(cliente2);
        lcc.quitarEmpleado(empleado2);
        lcc.mostrarClientes();
        lcc.mostrarEmpleados();
    }
}
