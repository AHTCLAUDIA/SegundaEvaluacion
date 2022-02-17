package interfaces.ejercicios.ej12biblioteca;

/*
La clase Libro implementa esta interfaz.
 */

public class Libro extends Publicacion implements Prestable{
    boolean prestado;

    public Libro(String código, String título, int año) {
        super(código, título, año);
        this.prestado = false; /* Los libros, cuando se
        crean, no están prestados.*/
    }

    /*
    método toString() que devuelve el valor de todos los
atributos en una cadena de caracteres.
     */
    @Override
    public String toString() {
        return "LIBRO:" +
                "prestado=" + prestado +
                ", código='" + código + '\'' +
                ", título='" + título + '\'' +
                ", año=" + año +
                '}';
    }

    /*
    También tienen un método que
devuelve el año de publicación y otro para el código.
    --> getters */
    public int getAño() {
        return año; // puedo recuperar el año de la superclase porque lo hereda
    }

    public String getCodigo() {
        return código;
    }

    @Override
    public void prestar() {
        this.prestado = true; // prestar un libro es poner su atributo a true
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public void prestado() {
        if (this.prestado) {
            System.out.println("Está prestado");
        } else {
            System.out.println("No está prestado");
        }
    }
}
