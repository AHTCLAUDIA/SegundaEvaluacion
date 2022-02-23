package examen2021;

public class Persona {
    // Tiene dos atributos privados: dni y nombre.
    private String dni;
    private String nombre;

    // Tiene un constructor con dos parámetros.
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    /*
    Tiene métodos para recuperar nombre y dni, y para cambiar
el nombre de la persona.
     */
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    Tiene un método toString(). Al imprimir su resultado
muestra nombre y DNI de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
