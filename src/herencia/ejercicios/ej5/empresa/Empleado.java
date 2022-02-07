package herencia.ejercicios.ej5.empresa;

public class Empleado extends Persona{
    double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }


    @Override
    public String toString() {
        return "Persona: " + "\nnombre: " + nombre + "\nedad=" + edad +
                "\n Empleado: sueldo " + sueldoBruto;
    }

    @Override
    public void mostrar() {
        //super.mostrar();
        System.out.println(toString());
    }

    public double calcularSalarioNeto() {
        return sueldoBruto * 0.85;
    }
}
