package diagramasclases.empresaempleadocliente;

/*
La clase persona no se puede instanciar, sólo sirve para que otras clases
hereden de ella.
 */
public abstract class Persona {
    protected String nombre;
    protected int edad;

    // Constructor parametrizado

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    // Método para mostrar datos, que será sobreescrito en las subclases
    public void mostrarDatos() {
        System.out.println(toString());
    }

}
