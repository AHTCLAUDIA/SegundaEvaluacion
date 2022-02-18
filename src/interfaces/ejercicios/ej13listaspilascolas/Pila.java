package interfaces.ejercicios.ej13listaspilascolas;

public class Pila {
    Lista pila;

    public Pila() {
        this.pila = new Lista();
    }

    public void apilar(Integer elemento) {
        // en las pilas los elementos siempre se añaden al final
        pila.insertarAlFinal(elemento);
    }

    public Integer desapilar() {
        // guardamos el elemento en una variable antes de borrarlo
        // para poder devolverlo después
        Integer cima = pila.getElemento(pila.númeroElementos()-1);
        // lo eliminamos de la pila
        pila.eliminarElemento(pila.númeroElementos()-1);
        return cima;
    }

    public void mostrar() {
        pila.mostrarElementos();
    }
}
