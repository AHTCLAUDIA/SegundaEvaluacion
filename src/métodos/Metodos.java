package métodos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        // para ejecutar el código, tenemos que llamar al método desde otro método

        elegirMétodo();

    }

    public static void ejercicio10() { // aquí declaramos el método
                        /*
        Dado un número de dos dígitos, imprime su primer número (las decenas).
         */
        System.out.println("***** Ejercicio 10 ********");
        int num = 95; // lo podría pedir por teclado
        int decenas = num / 10;
        // int unidades = num % 10; esto no me lo piden
        System.out.println("Decenas: " + decenas);
    }

    public static void ejercicio11() {
                /*
        Dado un número de dos cifras, escribe un programa que permita obtener el número
invertido. Ejemplo, si se introduce 23 que muestre 32.
         */
        System.out.println("***** Ejercicio 11 ********");
        Scanner sc = new Scanner(System.in);
        System.out.println("Número a invertir: ");
        int número = sc.nextInt();

        // separo decenas y unidades
        int decenas = número / 10;
        int unidades = número % 10;

        // ahora lo que antes "pesaba" como unidad ahora tiene que "pesar" como decena
        int invertido = unidades * 10 + decenas;
        System.out.println("Número invertido:" + invertido);
    }

    public static void ejercicio12() {
        /*
        Escribe un programa que lea un número de tres cifras y muestre el número invertido.
Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
introducimos 976, el programa debe mostrar 679.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de tres cifras:");
        int número = sc.nextInt(); // ej: 976

        // separamos decenas, centenas y unidades
        int c = número / 100;
        int resto = número % 100; // este resto son decenas y unidades juntas
        int d = resto / 10;
        int u = resto % 10;

        // ahora hacemos el número invertido
        int invertido = u * 100 + d * 10 + c;
        System.out.println("Invertido: " + invertido);
    }



    public static void elegirMétodo() {
        // Pide un número de ejercicio, y lo ejecuta
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué ejercicio quieres hacer? \n 10\n11\n12");
        int ej = sc.nextInt();
        switch (ej) {
            case 10:
                ejercicio10();
                break;
            case 11:
                ejercicio11();
                break;
            case 12:
                ejercicio12();
                break;
            default:
                System.out.println("Opción desconocida.");
        }
    }


}
