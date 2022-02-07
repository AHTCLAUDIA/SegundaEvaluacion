package diagramasclases.empresaempleadocliente;

public class Empleado extends Persona{
    private float sueldoBruto; // getters y setters ?

    /*
    Uno solamente recibe nombre, y edad, asigna un sueldo bruto
de 12.000.
     */
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
        this.sueldoBruto = 12000;
    }

    // Otro constructor recibe e inicializa todos los parámetros.
    public Empleado(String nombre, int edad, float sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    // Métodos para mostrar y cambiar el sueldo bruto.
    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    /*
    calcularSueldoNeto(): float. El sueldo neto se calcula descontando un 7%
para la Seguridad Social y el IRPF según los siguientes tramos:
     */
    public float calcularSueldoNeto() {
        float sueldoNeto = sueldoBruto - sueldoBruto * 7/100;
        int tipo = 0;
        if (sueldoBruto <= 12450) {
            tipo = 19;
        } else if (sueldoBruto > 12450 && sueldoBruto <= 20200) {
            tipo = 24;
        } else if (sueldoBruto > 20200 && sueldoBruto <= 35200) {
            tipo = 30;
        } else if (sueldoBruto > 35200 && sueldoBruto <= 60000) {
            tipo = 37;
        } else if (sueldoBruto > 60000 && sueldoBruto <= 300000) {
            tipo = 45;
        } else {
            tipo = 47;
        }
        sueldoNeto = sueldoNeto - sueldoNeto * tipo / 100;
        return sueldoNeto;
    }

    /*
    Un método que muestre los datos del empleado, incluyendo el sueldo
bruto y el sueldo neto.
     */

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldoNeto=" + calcularSueldoNeto() +
                '}';
    }

    @Override
    public void mostrarDatos() {
        // super.mostrarDatos();
        System.out.println(toString());
    }
}
