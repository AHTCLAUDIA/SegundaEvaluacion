package cadenas;

import java.util.Scanner;

public class Ejercicio16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String l = crearLista(); // se invoca al comenzar el programa
        int op = menu();
        ejecutarOpción(op, l);
    }

    public static String crearLista() {
        /*
        pide las palabras que se van
añadiendo a la lista y devuelve el String que contiene todas ellas.
         */
        String lista = "";
        String palabra;
        do {
            System.out.println("Introduce una palabra (0 para salir):");
            palabra = sc.next(); // introduzco una palabra
            // compruebo si palabra es distinto de 0 para meterla o no en la lista
            if (!palabra.equals("0")) {
                lista = lista + palabra + " ";
                System.out.println(lista);
            }
        } while (!palabra.equals("0")); // mientras palabra != 0

       return lista;
    }

    public static int menu() {
        System.out.println("Elige una opción: " +
                "\n1. Añadir\n2. Contar\n3. Modificar\n4. Eliminar" +
                "\n5. Mostrar");
        int opción = sc.nextInt();
        // limpiamos el Scanner
        sc.nextLine();
        return opción;
    }

    public static void ejecutarOpción(int número, String cadena) {
        switch (número) {
            case 1:
                añadir(cadena);
                break;
            case 2:
                contar(cadena);
                break;
            case 3:
                modificar(cadena);
                break;
            case 4:
                eliminar(cadena);
                break;
            case 5:
                mostrar(cadena);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    public static void añadir(String cadena) {

    }

    public static void contar(String cadena) {

    }

    public static void modificar(String cadena) {

    }

    public static void eliminar(String cadena) {

    }

    public static void mostrar(String cadena) {

    }

}
