package cadenas;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String lista = crearLista(); // se invoca al comenzar el programa
        // vamos a hacer que cada vez que se ejecuta una opción del menú
        // nos pregunte si queremos salir
        boolean salir = false;
        do {
            int op = menu();
            lista = ejecutarOpción(op, lista);
            // una vez completada una de las acciones que le dijimos en el menú, preguntamos
            System.out.println("¿Quieres salir? (s/n)");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 's') {
                salir = true;
            } else {
                salir = false;
            }
        } while (!salir);


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

    public static String ejecutarOpción(int número, String cadena) {
        switch (número) {
            case 1:
                cadena = añadir(cadena);
                break;
            case 2:
                contar(cadena);
                break;
            case 3:
                cadena = modificar(cadena);
                break;
            case 4:
                cadena = eliminar(cadena);
                break;
            case 5:
                mostrar(cadena);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        return cadena;
    }

    public static String añadir(String cadena) {
        // añade una palabra a la lista.
        System.out.println("Palabra a añadir: ");
        String palabra = sc.nextLine();
        cadena = cadena + palabra + " ";
        return cadena;
    }

    public static void contar(String cadena) {
        // cuenta las palabras que tiene la lista
        int contador = 0;
        System.out.println(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            // si encontramos un espacio, incrementamos el contador
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " palabras en la lista.");
    }

    public static String modificar(String cadena) {
        // sustituye una palabra por otra
        System.out.println("¿Qué palabra quieres sustituir?");
        String palabraOld = sc.nextLine();
        System.out.println("¿Por qué palabra quieres reemplazarla?");
        String palabraNew = sc.nextLine();
        cadena = cadena.replace(palabraOld, palabraNew);
        return cadena;
    }

    public static String eliminar(String cadena) {
        // elimina una palabra de la lista
        System.out.println("¿Qué palabra quieres eliminar?");
        String palabra = sc.next();
        cadena = cadena.replace(palabra + " ", "");
        return cadena;
    }

    public static void mostrar(String cadena) {
       // muestra la lista de palabras.
        System.out.println(cadena);
    }

}
