package herencia.ejemplos.ej2;

import org.demo.paquete.C;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Vamos a crear una persona = un objeto de tipo Persona
        Persona persona1 = new Persona("Pepa", 2000, "Melancolía, 3");
        persona1.imprimeDatos();

        // Crear un cliente y mostrar sus datos
        Cliente cliente1 = new Cliente("Cliente", 2005, "Tristeza, 13", 12345678, true);
        cliente1.mostrarDatos();

        // Vamos a crear un empleado
        Empleado empleado1 = new Empleado("Currito", 1999, "Agobio, 24", LocalDate.of(2022,1,27), 50000);
        empleado1.mostrarDatos();

        // Creamos un programador y mostramos sus datos
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Javascript");
        lenguajes.add("PHP");
        Programador programador1 = new Programador("Tecla", 1987, "Quepena, 17", LocalDate.of(2023,9,1), 25000, lenguajes);
        programador1.mostrarDatos();

        // Manager
        Manager jefe = new Manager("Boss", 1970, "Decepción, 14", LocalDate.of(2000, 5, 13), 90000, true);
        jefe.mostrarDatos();

        // Vamos a probar el método equals de Object que hemos sobreescrito en Empleado
        /*
        Empleado empleado2 = empleado1;
        Empleado empleado3 = new Empleado("Ruben", 1995, "Aquí, 3", LocalDate.now(), 25000);
        System.out.println("\nProbamos el método equals:");
        System.out.println(empleado1.equals(empleado2));
        System.out.println(empleado1.equals(empleado3));
        */

        System.out.println(programador1.getClass());
    }


}
