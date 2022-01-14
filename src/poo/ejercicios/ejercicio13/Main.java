package poo.ejercicios.ejercicio13;

import poo.ejercicios.ejercicio14.Robot;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creamos objetos de tipo Libro

        Libro libro1 = new Libro("El asesinato de Pitégoras", 2013, new String[]{"Marcos Chicot"});

        // Queremos saber el título
        System.out.println(libro1.getTitulo());
        // Queremos cambiar el título
        libro1.setTitulo("Los besos");
        System.out.println(libro1.getTitulo());

        // vemos los autores
        System.out.println(java.util.Arrays.toString(libro1.getAutores())); // ejemplo de cómo podemos utilizar una clase sin importarla .> ponemos el nombre completo

        // cambiamos el autor
        libro1.setAutores(new String[]{"Manuel Vilas", "El Bananito"});
        System.out.println(java.util.Arrays.toString(libro1.getAutores())); // ejemplo de cómo podemos utilizar una clase sin importarla .> ponemos el nombre completo

        // Ejemplo que no viene a cuento en este ejercicio para ver el nombre completo de la clase
        System.out.println("Nombre completo de la clase Main: " + Main.class.getName());
        System.out.println("Nombre completo de la clase Robot: " + Robot.class.getName());

    }
}
