import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase es la resolución de la práctica de métodos
 * @author Ana
 */
public class PrácticaMétodos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean seguir = true;
        do {
            int ejNum = menu();
            sc.nextLine();
            resolverEjercicio(ejNum);
            System.out.println("¿Quieres resolver otro? (s/n)");
            char c = sc.nextLine().charAt(0);
            if (c == 'n'){
                seguir = false;
            }
        } while (seguir);
    }

    private static int menu() {
        int opción;
        do {
            System.out.println("¿Qué ejercicio quieres resolver? (1-6)");
            System.out.println();
            opción = sc.nextInt();
            if (opción < 1 || opción > 6) {
                System.out.println("Opción incorrecta.");
            }
        } while (opción < 1 || opción > 6);
        return opción;
    }

    /**
     * Invoca el método que resuelve ele ejercicio pasado por parámetro
     * @param opción    es el número correspondiente al ejercicio a resolver
     */
    private static void resolverEjercicio(int opción) {
        switch (opción) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
        }
    }

    /**
     * Muestra el enunciado del primer ejercicio, e invoca al método determinarSigno
     */
    private static void ejercicio1() {
        System.out.println("Escribe un método de nombre determinarSigno que reciba un número entero y\n" +
                "compruebe si el número es negativo, positivo o cero. El método debe devolver -1, 1 o\n" +
                "0, respectivamente.");
        System.out.println("Introduce un número entero:");
        int num = sc.nextInt();
        sc.nextLine();
        int resultado = determinarSigno(num);
        System.out.println(resultado);
    }

    private static int determinarSigno(int num) {
        if (num >  0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }


    private static void ejercicio2() {
        System.out.println("Implementa el método sumaEnRango para calcular la suma de números enteros en el\n" +
                "rango que va desde un número (inclusive) a otro (no inclusive) pasados como\n" +
                "parámetro.");
        System.out.println("Introduce el primer número:");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int n2 = sc.nextInt();
        sc.nextLine();
        sumaEnRango(n1, n2);
    }

    public static void sumaEnRango(int num1, int num2) {
        int suma = 0;
        for (int i = num1; i < num2; i++) {
            suma = suma + i;
        }
        System.out.println("La suma de números desde " + num1 + " hasta " + num2 + " (no incluido) es " + suma);
    }

    private static void ejercicio3() {
        System.out.println("Dado un método que recibe un valor long y devuelve el valor máximo del tipo long\n" +
                "menos el número dado:\n" +
                "public static long getMaxMenosValor(long val) {\n" +
                "return Long.MAX_VALUE - val;\n" +
                "}\n" +
                "Sobrecarga este método con un nuevo método que reciba un int y devuelva el valor\n" +
                "máximo del tipo int menos el valor dado. El tipo del valor retornado debe ser el mismo que\n" +
                "el del parámetro.");

        System.out.println("Llamada al primer método");
        System.out.println("========================");
        System.out.println("Introduce valor:");
        long l = sc.nextLong();
        System.out.println("Resultado: " + getMaxMenosValor(l));
        System.out.println("Llamada al segundo método");
        System.out.println("=========================");
        System.out.println("Introduce valor:");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("Resultado: " + getMaxMenosValor(i));
    }

    public static long getMaxMenosValor(long val) {
        return Long.MAX_VALUE - val;
    }

    public static int getMaxMenosValor(int val) {
        return Integer.MAX_VALUE - val;
    }

    private static void ejercicio4() {
        System.out.println("Tenemos un método print(String arg). El método devuelve el nombre y su\n" +
                "argumento (entre comillas, porque es un String). Por ejemplo, pasando el argumento\n" +
                "“test”\n" +
                "print(\"test\")\n" +
                "Sobrecarga este método escribiendo un nuevo método con el mismo nombre y dos\n" +
                "argumentos: un String y un entero. El nuevo método debe imprimir el nombre y los dos\n" +
                "parámetros. Por ejemplo:\n" +
                "print(\"test\", 4)");
        System.out.println("Llamada al primer método");
        System.out.println("========================");
        System.out.println("Cadena a pasar como argumento:");
        String cadena = sc.nextLine();
        System.out.println(print(cadena));
        System.out.println("Llamada al segundo método");
        System.out.println("=========================");
        System.out.println("Cadena a pasar como argumento:");
        cadena = sc.nextLine();
        System.out.println("Número a pasar como argumento:");
        int número = sc.nextInt();
        sc.nextLine();
        print(cadena, número);
    }

    public static String print(String arg) {
        return "\"" + arg + "\"";
    }

    public static void print(String arg, int num){
        System.out.println("print(\"" + arg + "\", " + num + ")");
    }

    private static void ejercicio5() {
        System.out.println("Escribe un método llamado sumarValorPorÍndice. El método debe recibir un array de\n" +
                "longs y sumar al elemento especificado por el índice el valor pasado. Parámetros que\n" +
                "recibe: un array de longs, el índice de un elemento (int) y el valor a sumar (long). El\n" +
                "método no devuelve ningún valor. La siguiente invocación debería funcionar\n" +
                "correctamente:\n" +
                "sumarValorPorÍndice(array, índice, valor);");
        // Vamos a crear un array de 20 longs aleatoriamente con números entre 0 y 100
        long[] l = new long[20];
        for (int i = 0; i < l.length; i++) {
            l[i] = (long) (Math.random() * 100);
        }
        // El valor a sumar también lo generamos aleatoriamente, entre 0 y 100
        int valor = (int) (Math.random() * 100);
        System.out.println("Valor:" + valor);
        // Y el índice también lo generamos aleatoriamente, entre 0 y 19
        int índice = (int) (Math.random() * 19);
        System.out.println("Índice:" + índice);
        //sc.nextLine();
        // llamamos al método
        sumarValorPorÍndice(l, valor, índice);
    }

    public static void sumarValorPorÍndice(long[] array, int valor, int índice) {
        System.out.println("Array antes de sumar: " + Arrays.toString(array));
        array[índice] = array[índice] + valor;
        System.out.println("Array después de sumar: " + Arrays.toString(array));
    }

    private static void ejercicio6() {
        System.out.println("Escribe un método llamado getPrimeroYÚltimo. El método recibe un array de enteros\n" +
                "y devolver otro array de enteros. El array retornado debe contener dos elementos: el\n" +
                "primero y el último de los elementos del array de entrada.");

        // Creamos un array de 20 enteros aleatoriamente, entre 0 y 100
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array de enteros: " + Arrays.toString(array));
        System.out.println("Resultado: " +  Arrays.toString(getPrimeroYÚltimo(array)));
    }

    public static int[] getPrimeroYÚltimo(int[] array) {
        return new int[]{array[0], array[array.length-1]};
    }
}
