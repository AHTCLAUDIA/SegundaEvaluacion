package interfaces.ejercicios.ej13listaspilascolas;

import java.util.ArrayList;

/**
 * Implementar la clase Lista correspondiente a una lista de números de la clase Integer.
 * Los números se guardarán en un array que se redimensionará con las inserciones y
 * eliminaciones, aumentando o disminuyendo la capacidad de la lista según el caso.
 */
public class Lista {
    ArrayList<Integer> lista;

    // Un constructor que inicialice la tabla con un tamaño 0.
    // cuando creamos una lista se crea un arraylist vacío
    public Lista() {
        this.lista = new ArrayList<>(0);
    }

    //Obtener el número de elementos insertados en la lista.
    public int númeroElementos() {
        return lista.size();
    }

    //Insertar un número al final de la lista.
    public void insertarAlFinal(Integer elemento) {
        lista.add(elemento);
    }

    //Insertar un número al principio de la lista.
    public void insertarAlPrincipio(Integer elemento) {
        lista.add(0, elemento);
    }
    //Insertar un número en un lugar de la lista cuyo índice, se pasa como parámetro.
    public void insertarEnPosicion(int índice, Integer elemento) {
        lista.add(índice, elemento);
    }
    //Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
    public void añadirLista(Lista l) {
        lista.addAll(l.lista); // estoy añadiendo el arraylist que está dentro de la lista (el objeto de tipo Lista) que estoy pasando
    }
    //Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
    public void eliminarElemento(int índice) {
        lista.remove(índice);
    }
    //Obtener el elemento cuyo índice se pasa como parámetro.
    public Integer getElemento(int índice) {
        return lista.get(índice);
    }

    /*Buscar un número en la lista, devolviendo el índice del primer lugar donde se
    encuentre. Si no está, devolverá -1.*/
    public int buscarNumero(Integer elemento) {
        return lista.indexOf(elemento);
    }

    //Mostrar los elementos de la lista por consola.
    public void mostrarElementos() {
        System.out.println(lista);
    }

    /*
    Añadir a la clase Lista el método estático
Lista concatena (Lista l1, Lista L2)
Que construye y devuelve una lista que contiene, en el mismo orden, una copia de
todos los elementos de l1 y l2.
     */
    public static Lista concatena(Lista l1, Lista l2) {
        Lista l = new Lista();
        l.añadirLista(l1);
        l.añadirLista(l2);
        return l;
    }

}
