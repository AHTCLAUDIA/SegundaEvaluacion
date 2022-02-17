package interfaces.ejercicios.ej12biblioteca;

/*
Para prevenir posibles cambios en el programa se tiene que
implementar una interfaz Prestable con los métodos prestar(), devolver()
y prestado().
 */
public interface Prestable {
    void prestar();
    void devolver();
    void prestado();
}
