package herencia.ejemplos.ej2;

public class Cliente extends Persona{
    private long numContrato;
    private boolean clienteOro;

    public Cliente(String nombre, int añoNacimiento, String dirección, long numContrato, boolean clienteOro) {
        super(nombre, añoNacimiento, dirección); // le pasamos estos valores al constructor
        // además de los atributos de la superclase (Persona) tenemos que
        // inicializar los atributos de esta clase
        this.numContrato = numContrato;
        this.clienteOro = clienteOro;
    }

    // método toString


    @Override
    public String toString() {
        return "Cliente{" +
                "numContrato=" + numContrato +
                ", clienteOro=" + clienteOro +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    // imprime toString()
    public void mostrarDatos() {
        System.out.println(toString());
    }
}
