package arraylist;

import org.demo.A;

import java.util.ArrayList;

public class EjemplosArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); // creo un arraylist vacío
        // paréntesis vacío: te lo crea con 10 elementos
        // si quieres crearlo con un tamaño determinado lo pones en ()
        System.out.println("Tamaño del arraylist:");
        System.out.println(nombres.size()); // es lo mismo que el length de los arrays
        System.out.println("Añadimos dos elementos:");
        nombres.add("Justino");
        nombres.add("Helena"); // al añadir, lo pone en la última posición
        System.out.println(nombres.size());
        System.out.println(nombres); // no hace falta Arrays.toString()
        System.out.println("Añadimos un nombre en medio");
        nombres.add(1,"Joshua");
        System.out.println(nombres);
        System.out.println("Añdimos un nombre al principio:");
        nombres.add(0, "Laura");
        System.out.println(nombres);
        System.out.println("Imprimimos el que está en tercera posición:");
        System.out.println(nombres.get(2));
        System.out.println("Quitamos a Helena y ponemos a Mario");
       //System.out.println(nombres.set(3, "Mario"));
        nombres.set(3, "Mario");
        System.out.println(nombres);
        System.out.println("Vamos a quitar a Justino");
        nombres.remove("Justino");
        System.out.println(nombres);
        System.out.println("Borramos todos los elementos");
        nombres.clear();
        System.out.println(nombres);


        /// Otro ejemplo para ver cómo podemos poner un arraylist al final de otro
        ArrayList<Integer> números = new ArrayList<>();
        números.add(1);
        números.add(2);
        for (int i = 3; i <= 10; i++) {
            números.add(i);
        }
        System.out.println(números);
        System.out.println("Juntamos números con números2");
        ArrayList<Integer> números2 = new ArrayList<>();
        números2.add(100);
        números2.addAll(números);
        System.out.println(números2);

        System.out.println("Vamos a ver si está el número 13");
        System.out.println(números2.contains(13));
        System.out.println("Vamos a ver si está el número 100");
        System.out.println(números2.contains(100));

    }
}
