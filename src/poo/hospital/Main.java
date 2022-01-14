package poo.hospital;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Normalmente los objetos los creamos en tiempo de ejecución

        // Voy a crear un objeto a partir de la clase Paciente
        // La clase es como un tipo de dato
        // Tipo nombreObjeto = new métodoconstructor
        Paciente paciente1 = new Paciente(); // constructor sin parámetros
        // ahora le asignamos valores a los atributos
        //paciente1.nombre = "Josefina";
        //paciente1.edad = 50;
        //paciente1.codigoSS = "12345678";
        //Síntomas
        //paciente1.síntomas = new String[]{"Tos", "Fiebre", "Cansancio"};

        // Vamos a probar el constructor con parámetros
        Paciente paciente0 = new Paciente("Lin", 23, "223224567", new String[]{"Tos", "Cansancio"});
        System.out.println("Datos:");
        System.out.println("======");
       //System.out.println("Nombre: " + paciente0.nombre + ", edad " + paciente0.edad);
        //System.out.println(Arrays.toString(paciente0.síntomas));
        // Si quiero mostrar el nombre del paciente:
        System.out.println(paciente0.getNombre());
        System.out.println(paciente0.getEdad());
        System.out.println(paciente0.getCodigoSS());
        System.out.println(Arrays.toString(paciente0.getSíntomas()) );

        // cambiamos el nombre de el paciente0
        paciente0.setNombre("María");
        // ahora quiero ver cómo se llama
        System.out.println(paciente0.getNombre());


        // Ejemplo de tipo referencia (asignación peligrosa)
        Paciente paciente = new Paciente();
        paciente.setNombre("Hache");
        paciente.setEdad(24);
        System.out.println(paciente.getNombre() + " " + paciente.getEdad());//Hache 24
        Paciente p = paciente; // no estoy creando un objeto
        System.out.println(p.getNombre() + " " + p.getEdad()); // Hache 24
        paciente.setEdad(25);
        System.out.println(p.getEdad()); // 25
    }
}
