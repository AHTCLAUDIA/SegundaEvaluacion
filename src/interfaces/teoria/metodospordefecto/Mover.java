package interfaces.teoria.metodospordefecto;

public interface Mover {
    void pasoAdelante(); // método abstracto pero la palabra abstract no es obligatoria en las interfaces
    void girarIzquierda();
    void girarDerecha();
     // meter un método abstracto
    // con la aplicación ya en funcionamiento
    // se carga la aplicación, obliga a modificarla

    // en su lugar, todo lo que queramos añadir
    // lo ponemos como método por defecto
    // que nos es obligatorio
    default void darseLaVuelta() {

    }
}
