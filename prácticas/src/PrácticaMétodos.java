import java.util.Scanner;

/**
 * Esta clase es la resolución de la práctica de métodos
 * @author Ana
 */
public class PrácticaMétodos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        String enunciado = "Escribe un método de nombre determinarSigno que reciba un número entero y\n" +
                "compruebe si el número es negativo, positivo o cero. " +
                "El método debe devolver -1, 1 o 0, respectivamente.";
        System.out.println(enunciado); // imprimo el enunciado
        System.out.println("Introduce un número entero:");
        int n = sc.nextInt();
        sc.nextLine(); // "limpiamos" el sc para poder luego meter Strings si es necesario
        // llamamos al método determinarSigno con el número introducido
        ;
        System.out.println(determinarSigno(n));
    }

    public static int determinarSigno(int numero) {
        // comprueba si el número es negativo, positivo o 0
        if (numero > 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void ejercicio2() {
        String enunciado = "Implementa el método sumaEnRango para calcular la suma de números enteros en el\n" +
                "rango que va desde un número (inclusive) a otro (no inclusive) pasados como\n" +
                "parámetro.";
    }

    public static void ejercicio3() {
        String enunciado = "Dado un método que recibe un valor long y devuelve el valor máximo del tipo long\n" +
                "menos el número dado:\n" +
                "public static long getMaxMenosValor(long val) {\n" +
                "return Long.MAX_VALUE - val;\n" +
                "}\n" +
                "Sobrecarga este método con un nuevo método que reciba un int y devuelva el valor\n" +
                "máximo del tipo int menos el valor dado. El tipo del valor retornado debe ser el mismo que\n" +
                "el del parámetro.";
    }

    public static void ejercicio4() {
        String enunciado = "Tenemos un método print(String arg). El método devuelve el nombre y su\n" +
                "argumento (entre comillas, porque es un String). Por ejemplo, pasando el argumento\n" +
                "“test”\n" +
                "print(\"test\")\n" +
                "Sobrecarga este método escribiendo un nuevo método con el mismo nombre y dos\n" +
                "argumentos: un String y un entero. El nuevo método debe imprimir el nombre y los dos\n" +
                "parámetros. Por ejemplo:\n" +
                "print(\"test\", 4)";
    }

    public static void ejercicio5() {
        String enunciado = "Escribe un método llamado sumarValorPorÍndice. El método debe recibir un array de\n" +
                "longs y sumar al elemento especificado por el índice el valor pasado. Parámetros que\n" +
                "recibe: un array de longs, el índice de un elemento (int) y el valor a sumar (long). El\n" +
                "método no devuelve ningún valor. La siguiente invocación debería funcionar\n" +
                "correctamente:\n" +
                "sumarValorPorÍndice(array, índice, valor);";
    }

    public static void ejercicio6() {
        String enunciado = "Escribe un método llamado getPrimeroYÚltimo. El método recibe un array de enteros\n" +
                "y devolver otro array de enteros. El array retornado debe contener dos elementos: el\n" +
                "primero y el último de los elementos del array de entrada.";

    }

}
