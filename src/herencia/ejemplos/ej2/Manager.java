package herencia.ejemplos.ej2;

import java.time.LocalDate;

public class Manager extends Empleado{
    private boolean sonrisa;

    public Manager(String nombre, int añoNacimiento, String dirección, LocalDate fechaContrato, double salario, boolean sonrisa) {
        super(nombre, añoNacimiento, dirección, fechaContrato, salario);
        this.sonrisa = sonrisa;
        if (sonrisa == true) {

        }
    }

    @Override
    public String toString() {
        String s;
        if (this.sonrisa == true) {
            s = " :) ";
        } else {
            s = " :( ";
        }
        return "Manager{" +
                "fechaContrato=" + fechaContrato +
                ", salario=" + salario +
                ", sonrisa=" + s +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }
}
