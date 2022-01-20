package poo.enumerados;

import java.util.Arrays;
/**
 * Colores: https://dryant.com/programacion/como-poner-el-texto-de-color-en-la-consola-o-terminal-ejemplo-en-java/
 * Emojis: https://apps.timwhitlock.info/emoji/tables/unicode
 * Cómo utilizarlos: https://www.youtube.com/watch?v=D8uw2hefrB8
 */

public class MainEmojis {
    public static void main(String[] args) {
        Estacion ahora = Estacion.INVIERNO;
        System.out.println("Estamos en " + ahora);


        System.out.println("\nMétodos predefinidos: ");
        System.out.println("=====================");
        System.out.println("name(): " + ahora.name());
        System.out.println("valueOf(): " + Estacion.valueOf("PRIMAVERA"));
        // Estacion[] valores = Estacion.values();
        System.out.println("values(): " + Arrays.toString(Estacion.values()));
        // se puede iterar sobre este array
        for (Estacion valor: Estacion.values()) {
            System.out.println(valor + "\t");
        }
        System.out.println("ordinal(): " + Estacion.OTOÑO.ordinal());
        System.out.println("equals(): " + ahora.equals(Estacion.PRIMAVERA));

        mostrarEstacion(ahora);
        mostrarEstacion(Estacion.VERANO);
        mostrarEstacion(Estacion.PRIMAVERA);
        mostrarEstacion(Estacion.OTOÑO);



    }

    static void mostrarEstacion(Estacion Estacion) {
        switch (Estacion) {
            case PRIMAVERA -> System.out.println("Estamos en " + " \uD83c\udf3a " + Estacion.name() + " " + " \uD83c\udf3a");
            case VERANO -> System.out.println("Estamos en " + "\u2600 " + Estacion.name() + " " + " \u2600");
            case OTOÑO -> System.out.println("Estamos en " + "\ud83c\udf42 " + Estacion.name() + " " + " \ud83c\udf42");
            case INVIERNO -> System.out.println("Estamos en " + "\u2744 "+ Estacion.name() + " \u2744");

        }
    }
}
