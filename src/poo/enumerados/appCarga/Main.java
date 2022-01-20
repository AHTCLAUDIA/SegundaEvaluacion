package poo.enumerados.appCarga;

/**
 * Colores: https://dryant.com/programacion/como-poner-el-texto-de-color-en-la-consola-o-terminal-ejemplo-en-java/
 */

public class Main {
    public static void main(String[] args) {
        //System.out.println("\033[33m Este texto saldrá en amarillo");
        String black="\033[30m";
        String red="\033[31m";
        String green="\033[32m";
        String yellow="\033[33m";
        String blue="\033[34m";
        String purple="\033[35m";
        String cyan="\033[36m";
        String white="\033[37m";
        String reset="\u001B[0m";

        mostrarCarga(Nivel.LLENO);
        mostrarCarga(Nivel.ALTO);
        mostrarCarga(Nivel.MEDIO);
        mostrarCarga(Nivel.BAJO);

        System.out.println("\uD83D\uDE00");
    }

    public static void mostrarCarga(Nivel nivel) {
        switch (nivel) {
            case LLENO -> System.out.println("\033[32m" + "[****]");
            case ALTO -> System.out.println("\033[32m" + "[*** ]");
            case MEDIO -> System.out.println("\033[33m" + "[**  ]");
            case BAJO -> System.out.println("\033[31m" + "[*   ]");
        }
    }
}
