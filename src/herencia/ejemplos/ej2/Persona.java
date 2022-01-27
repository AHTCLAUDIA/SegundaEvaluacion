package herencia.ejemplos.ej2;

public class Persona {
    // Ponemos los modificadores más "adecuados"
    protected String nombre;
    protected int añoNacimiento;
    protected String dirección;

    // si creo un constructor con parámetros en la superclase
    // me obliga a crear constructores en las subclases cuya primera instrucción es super
    // con los atributos de la superclase
    public Persona(String nombre, int añoNacimiento, String dirección) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    // para ver los datos de los objetos
    // imprimimos lo que devuelve el método toString()
    public void imprimeDatos(){
        System.out.println(toString());
    }
}
