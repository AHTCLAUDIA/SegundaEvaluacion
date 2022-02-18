package interfaces.ejercicios.ej13listaspilascolas;

/**
 * Clase para probar la clase Lista
 */

public class TestLista {
    public static void main(String[] args) {
        Lista l = new Lista();
        System.out.println("Prueba mostrar elementos");
        l.mostrarElementos();
        System.out.println("Nº elementos: " + l.númeroElementos());
        System.out.println("Prueba añadir al final");
        l.insertarAlFinal(2);
        l.mostrarElementos();
        System.out.println("Prueba añadir al principio");
        l.insertarAlPrincipio(6);
        l.mostrarElementos();
        System.out.println("Prueba añadir en medio");
        l.insertarEnPosicion(1, 8);
        l.mostrarElementos();
        System.out.println("Prueba añadir lista");
        // tenemos que otra lista para poder pasársela
        Lista lista2 = new Lista();
        for (int i = 0; i < 5; i++) {
            int número = (int) (Math.random() * 100); // creo un número entero random entre 1 y 100
            // lo añado a la lista con cualquiera de los métodos que ya tengo
            lista2.insertarAlFinal(número);
        }
        System.out.print("Lista a añadir: ");
        lista2.mostrarElementos();
        // añadimos a la primera lista esta otra que acabamos de crear
        l.añadirLista(lista2);
        l.mostrarElementos();
        System.out.println("Probamos eliminar por índice");
        l.eliminarElemento(2);
        l.mostrarElementos();
        System.out.println("Probamos obtener elemento");
        Integer i = l.getElemento(4);
        System.out.println(i);
        System.out.println("Probamos buscar elemento");
        Integer e = l.buscarNumero(80);
        System.out.println(e);
        System.out.println("Nº elementos: " + l.númeroElementos());
        /*
         anterior que le pasabas el indice y te daba el elemnto como le puedes decir que te de el ultimo de la lista?
         */
        System.out.println("Obtenemos el último elemento de la lista");
        System.out.println(l.getElemento(l.númeroElementos()-1));
        System.out.println("Probamos el método estático concatena");
        Lista.concatena(l,lista2).mostrarElementos(); // como devuelve una lista la puedo imprimir con el método que tiene la lista



    }
}
