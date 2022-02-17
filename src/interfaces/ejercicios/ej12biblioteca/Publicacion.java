package interfaces.ejercicios.ej12biblioteca;

/*
Es una clase pensada sólo para que libros y revistas hereden
de ella, así no se puede instanciar.
 */

public abstract class Publicacion {
    /*
    Las características comunes que se almacenan tanto para las
revistas como para los libros son el código, el título y el año de
publicación.
     */
    String código;
    String título;
    int año;

    /*
    Debe contener un constructor parametrizado con todos los
atributos.
     */

    public Publicacion(String código, String título, int año) {
        this.código = código;
        this.título = título;
        this.año = año;
    }
}
