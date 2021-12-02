package cadenas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class EjemplosCadenas {
    public static void main(String[] args) {
        String cadena = "Hola ¿Qué tal?";
        String cadena1 = "Y dijo: \"Vaya plan\". ";
        String vacía = ""; // no confundir con " " ni con null
        System.out.println(cadena);
        System.out.println(cadena1);

        System.out.println(cadena.length());
        System.out.println(cadena.charAt(2)); // el tercer carácter
        // Quiero imprimir el último carácter
        System.out.println(cadena.charAt(cadena.length()-1));

        int[] array = {1, 2, 3, 4};
        // puedo sustituir lo que tengo en una posición
        array[2] = 1000;
        System.out.println(Arrays.toString(array));

        // ESTO NO SE PUEDE HACER CON STRING


        // MÉTODOS

        System.out.println("********** MÉTODOS ***************");
        System.out.println("==================================");

        // Compruebo si una cadena está vacía
        System.out.println("¿Cadena vacía?: " + cadena.isEmpty());
        System.out.println("¿Cadena vacía?" + vacía.isEmpty());

        // Compruebo si la cadena consiste en un espacio en blanco
        String blanco = " ";
        System.out.println("¿La cadena es un espacio en blanco? " + blanco.isBlank());

        // Pasar to-do a mayúsculas
        System.out.println("Paso la cadena a mayúsculas:" + cadena.toUpperCase());

        // Pasar to-do a minúsculas
        System.out.println("Paso la cadena a minúsculas:" + cadena.toLowerCase());

        // Compruebo si empieza por ...
        System.out.println("¿Empieza por H? " + cadena.startsWith("H"));

        // Compruebo si termina por ...
        System.out.println("¿Termina con una ?? " + cadena.endsWith("?"));

        // Compruebo si contiene "hola"
        System.out.println("¿Contiene \"hola\"?" + cadena.contains("hola"));

        // Extraigo los caracteres del 4 al 6
        System.out.println("Extraigo subcadena: " + cadena.substring(3, 6));

        // Reemplazo las "a" y pongo en su lugar "i"
        System.out.println("Sustituyo \"a\" por \"i\": " + cadena.replace("a", "i"));

        // Quito espacios a izquierda y derecha
        String espacios = "   aaa   ";
        System.out.println(espacios.length());
        espacios = espacios.trim(); // "limpio" los espacios a los lados
        System.out.println(espacios.length());

        // COMPARACIONES DE TIPOS PRIMITIVOS: ==
       /*
       char a = 'a';

        char b = 'b';
        if (a == b)
*/
        String primera1 = "primera";
        String segunda1 = "segunda";
        String primera2 = "primera";
        String segunda2 = "SEGUNDA";
        System.out.println(primera1.equals(segunda1));//“primera”.equals(“segunda”)->false
        System.out.println(primera1.equals(primera2)); //“primera”.equals(“primera”)->true
        System.out.println(segunda1.equals(segunda2));//“segunda”.equals(“SEGUNDA”)->false
        System.out.println(segunda1.equalsIgnoreCase(segunda2)); // true


    }
}
