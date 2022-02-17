package interfaces.teoria.ejemplos;

public interface Interfaz {
    public static final int CONSTANTE = 0; // una interfaz puede tener constantes
    // String nombre; // una interfaz no puede tener parámetros

    /*
    public Interfaz() {

    } */ // una interfaz no puede tener constructores

    public void metodoAbstracto(); // puede tener métodos abstractos
            // estos métodos abstractos no necesitan llevar la palabra abstract
            // y además las clases OBLIGATORIAMENTE tienen que implementarlos

    default void métodoPorDefecto() {
        // estos métodos van implementados
        System.out.println("método por defecto");
        métodoPrivado(); // para esto sirven los métodos privados en una interfaz; para ser llamados desde otro método
    }

    private void métodoPrivado() {
        System.out.println("método privado -> para ser llamado desde la misma interfaz");
    }

    static void métodoEstático() {
        System.out.println("método estático");
    }

    /*
    en resumen:
        solamente los métodos abstractos no se implementan
        los otros métodos sí que hay que implementarlos en la interfaz
     */
}
