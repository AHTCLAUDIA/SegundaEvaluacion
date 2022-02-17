package interfaces.teoria.metodospordefecto;

/**
 * Como quiero que Batman se mueva --> tengo que implementar
 * la interfaz Mover, y así obligatoriamente tengo esos métodos
 * a desarrollar
 */
public class Batman implements Mover{
    @Override
    public void pasoAdelante() {
        System.out.print("adelante ");
    }

    @Override
    public void girarIzquierda() {
        System.out.print("izquierda ");
    }

    @Override
    public void girarDerecha() {
        System.out.print("derecha ");
    }

    @Override
    public void darseLaVuelta() {
        //Mover.super.darseLaVuelta();
        girarDerecha();
        girarDerecha();
    }
}
