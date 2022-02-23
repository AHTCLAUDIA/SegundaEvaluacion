package ferroviaria.personal;

public class Mecánico {
    String nombre;
    String teléfono;
    Especialidad especialidad;
    public static int mecánicos;

    // Constructor parametrizado
    public Mecánico(String nombre, String teléfono, Especialidad especialidad) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.especialidad = especialidad;
        mecánicos++;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // Métodos para imprimir datos del mecánico
    @Override
    public String toString() {
        return "Mecánico{" +
                "nombre='" + nombre + '\'' +
                ", teléfono='" + teléfono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }

    public void imprimirDatos() {
        System.out.println("\nDatos del mécánico " + this.nombre + " \uD83D\uDD27");
        System.out.println(this.toString());
    }
}


