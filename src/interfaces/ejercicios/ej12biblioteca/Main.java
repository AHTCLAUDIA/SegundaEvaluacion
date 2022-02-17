package interfaces.ejercicios.ej12biblioteca;

import interfaces.teoria.varias.A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos un libro por probar
        System.out.println("CREAMOS UN LIBRO");
        Libro libro1 = new Libro("L01", "La red púrpura", 2017);
        System.out.println(libro1); // con el método toString directamente con el nombre del objeto podemos imprimir los datos de libro
        System.out.println(libro1.getAño());
        System.out.println(libro1.getCodigo());
        System.out.println("Prestamos el libro");
        libro1.prestar();
        libro1.prestado();
        System.out.println("Devolvemos el libro");
        libro1.devolver();
        libro1.prestado();


        // Creamos una revista por probar
        System.out.println("\nCREAMOS UNA REVISTA");
        Revista revista1 = new Revista("R01", "Computer Hoy", 2022, 205);
        System.out.println(revista1); // con el método toString directamente con el nombre del objeto podemos imprimir los datos de libro
        System.out.println(revista1.getAño());
        System.out.println(revista1.getCodigo());

        System.out.println("Probamos el método cuentaPrestados");
        ArrayList<Libro> l = new ArrayList<>();
        l.add(libro1); // añadimos el primer libro al arraylist
        Libro libro2 = new Libro("L02", "La red púrpura", 2017);
        Libro libro3 = new Libro("L03", "La red púrpura", 2022);
        Libro libro4 = new Libro("L04", "La red púrpura", 2017);
        Libro libro5 = new Libro("L05", "La red púrpura", 2018);
        Libro libro6 = new Libro("L06", "La red púrpura", 2022);
        Libro libro7 = new Libro("L07", "La red púrpura", 2020);

        // Prestamos 3 libros
        libro1.prestar();
        libro3.prestar();
        libro7.prestar();

        // Añadimos los libros al ArrayList
        l.add(libro2);
        l.add(libro3);
        l.add(libro4);
        l.add(libro5);
        l.add(libro6);
        l.add(libro7);

        // Llamamos al método; como devuelve un int, lo guardo en una  variable y luego la imrpimo
        int n = cuentaPrestados(l);
        System.out.println(n);

        // Probamos el método de publicaciones anteriores creando el arraylist, dos revistas y añadiendo todo el arraylist de libros que ya tenemos
        ArrayList<Publicacion> p = new ArrayList<>();

        Revista revista2 = new Revista("R2", "Año 0", 2019, 2);
        Revista revista3 = new Revista("R3", "Año 0", 2020, 3);
        p.add(revista1);
        p.add(revista2);
        p.add(revista3);
        p.addAll(l);
        int pub = publicacionesAnterioresA(p, 2020);
        System.out.println(pub);
    }

    /*
    Un método estático cuentaPrestados(): recibe por parámetro un
ArrayList de Libros y devuelve cuántos de ellos están prestados.
     */
    public static int cuentaPrestados(ArrayList<Libro> libros) {
        // declaramos un contador
        int contador = 0;
        // recorremos el ArrayList con un for
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).prestado == true) { // si el libro que miramos en la posición i está prestado, incrementamos el contador
                contador++;
            }
        }
        return contador;
    }

    /*
    Un método estático publicacionesAnterioresA(): recibe por
parámetro un ArrayList de Publicaciones y un año, y devuelve
cuántas publicaciones tienen fecha anterior al año recibido por
parámetro.
     */
    public static int publicacionesAnterioresA(ArrayList<Publicacion> publicaciones, int año) {
        int contador = 0;
        for (int i = 0; i < publicaciones.size(); i++) {
            if (publicaciones.get(i).año < año)  // si el año de la publicación es menor que el introducido por parámetro
                contador++; // incrementamos el contador
        }
        return contador;
    }
}
