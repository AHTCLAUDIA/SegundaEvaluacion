package interfaces.ejercicios.ej12biblioteca;

public class Revista extends Publicacion{
    // Las revistas tienen un número.
    int número;

    /*
    En el momento de crear las revistas se
pasa el número por parámetro.
     */
    public Revista(String código, String título, int año, int número) {
        super(código, título, año);
        this.número = número;
    }

    /*
    método toString() que devuelve el valor de todos los
atributos en una cadena de caracteres.
     */
    @Override
    public String toString() {
        return "Revista{" +
                "código='" + código + '\'' +
                ", título='" + título + '\'' +
                ", año=" + año +
                ", número=" + número +
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
}
