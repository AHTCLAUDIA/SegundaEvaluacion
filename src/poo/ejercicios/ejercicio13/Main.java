package poo.ejercicios.ejercicio13;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(libro1.getAutores()));

        // cambiamos el autor
        libro1.setAutores(new String[]{"Manuel Vilas", "El Bananito"});
        System.out.println(Arrays.toString(libro1.getAutores()));

    }
}
