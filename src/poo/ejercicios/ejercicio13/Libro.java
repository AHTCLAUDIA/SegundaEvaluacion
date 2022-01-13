package poo.ejercicios.ejercicio13;

public class Libro {
    /*
    Escribe una clase llamada Libro. Debe contener tres atributos: título, de tipo String,
añoDePublicación, de tipo int y autores, de tipo array de String, y un constructor para
inicializar los atributos. El orden de los parámetros en el constructor debe ser el
mismo que el indicado en este enunciado.
     */

    // los atributos deben ser privados --> métodos get y set
    private String titulo;
    private int añoDePublicacion;
    private String[] autores;

    // Constructor

    public Libro(String titulo, int añoDePublicacion, String[] autores) {
        this.titulo = titulo;
        this.añoDePublicacion = añoDePublicacion;
        this.autores = autores;
    }

    // getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    // crear dos libros: clase Main




}
