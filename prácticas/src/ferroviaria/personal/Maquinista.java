package ferroviaria.personal;

public class Maquinista {
    private String nombre;
    private String DNI;
    private float sueldo;
    private int rango;
    public static int maquinistas;

    // Constructor parametrizado
    public Maquinista(String nombre, String DNI, float sueldo, int rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
        maquinistas++;
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }


    // Imprimir datos del maquinista


    @Override
    public String toString() {
        return "Maquinista{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sueldo=" + sueldo +
                ", rango=" + rango +
                '}';
    }

    public void imprimirDatos() {
        System.out.println("\nDatos del maquinista " + this.nombre + ": ");
        System.out.println(this.toString());
    }
}