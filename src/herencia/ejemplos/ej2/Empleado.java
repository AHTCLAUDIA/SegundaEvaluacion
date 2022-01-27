package herencia.ejemplos.ej2;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected LocalDate fechaContrato;
    protected double salario;

    public Empleado(String nombre, int añoNacimiento, String dirección) {
        super(nombre, añoNacimiento, dirección); // esto invoca al constructor de la superclase y le pasa los valores

    }
}
