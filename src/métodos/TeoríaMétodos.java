package métodos;

import java.util.Arrays;

public class TeoríaMétodos {
    public static void main(String[] argumentos) {
    // Calculo la porción de semillas:
        //System.out.println("Dale " + calcularSemillas(400, 5) + "g de semillas."); ;

        //contarSemillas(400, 5);


        // Paso por valor
        int p = calcularSemillas(400, 5);
        System.out.println(p);
        añadirSemillas(p); // el método añadir semillas suma 50 a p
        System.out.println(p);


        // Paso por referencia
        int[] números = {1, 5, 3, 2, 4};
        System.out.println(Arrays.toString(números));
        ordenarArray(números);
        System.out.println(Arrays.toString(números));

        // Varargs
        // Sirve para meter un número en principio indeterminado de argumentos
        imprimirNotas("María", 7, 7, 8, 5, 9, 9);
        imprimirNotas("Julián", 7, 7, 8);
        imprimirNotas("Pastora", 7, 7, 8, 5);

        // Ejercicio 16 teoría
        method(10);


    }

    public static void method(short s) {
        System.out.println("short");
    }
    public static void method(byte b) {
        System.out.println("byte");
    }
    public static void method(int i) {
        System.out.println("int");
    }
    public static void method(long l) {
        System.out.println("long");
    }


    public static void imprimirNotas(String nombre, int... notas) {
        System.out.println("Se han introducido " + notas.length + " notas: ");
        System.out.println("Notas de " + nombre + ": " + Arrays.toString(notas));
    }

    public static void ordenarArray(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void añadirSemillas(int porción) {
        porción += 50; // porción = porción + 50;
        System.out.println("La porción incrementada es " + porción);
    }

    public static int calcularSemillas(int pesoLoro, int edadLoro) {
        int semillas = pesoLoro / 5 + edadLoro;
        return semillas;
    }

    public static void contarSemillas(int pesoLoro, int edadLoro) {
        System.out.println("Tienes que dar a tu loro " + calcularSemillas(pesoLoro, edadLoro) +
                "g de semillas al día.");
    }


    // Paso por valor

}
