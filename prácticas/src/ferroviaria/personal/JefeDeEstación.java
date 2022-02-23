package ferroviaria.personal;

import java.time.LocalDate;

public class JefeDeEstación {
    private String nombre;
    private String DNI;
    private LocalDate fechaNombramiento;
    public static int jefes;

    // Constructor parametrizado
    public JefeDeEstación(String nombre, String DNI, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
        jefes++;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDate fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    // Métodos para imprimir los valores de los atributos

    @Override
    public String toString() {
        return "JefeDeEstación{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }

    public void imprimirDatos() {
        System.out.println("\nDatos del jefe de estación: \uD83D\uDC6E");
        System.out.println(this.toString());
    }
}

