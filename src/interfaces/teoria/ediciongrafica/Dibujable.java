package interfaces.teoria.ediciongrafica;

/**
 * creamos una interfaz con métodos abstractos
 */
public interface Dibujable {

    public void dibujarRecta(); // métodos abstractos; en las interfaces no es necesario que lleven la palabra abstract
    public void dibujarCurva();
    public void dibujarLibre();


    private void digoHola() {
        System.out.println("HOla");
    }



    // estos métodos abstractos tendrán que implementarlos
    //  OBLIGATORIAMENTE todas las clases que implementen esta interfaz
}
