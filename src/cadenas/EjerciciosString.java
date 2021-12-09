package cadenas;

import java.util.Scanner;

public class EjerciciosString {
    // Declaramos aquí el Scanner con la palabra clave static, para que se pueda utilizar el objeto sc en toda la clase
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Todos los ejercicios menos el 16 piden una cadena de texto por teclado
        // La pedimos aquí mismo, y después le pasaremos la cadena al método como parámetro
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();



        //ejercicio01(cadena); // entre paréntesis tengo que poner una variable String
        //ejercicio02(cadena);
        ejercicio03(cadena);

        // Escribir aquí un menú en que preguntamos al usuario qué ejercicio quiere realizar
        // A continuación según la opción elegida se invoca al método correspondiente al ejercicio seleccionado

    }

    public static void ejercicio01(String cad) {
        /*
        Ejercicio 1
Escribir por pantalla cada carácter de una cadena introducida por teclado.
         */
        // la cadena entra por parámetro (entre los paréntesis)
        System.out.println("\nEjercicio 1");
        System.out.println("===========");
        for (int i = 0; i < cad.length(); i++) {
            System.out.print("'" + cad.charAt(i) + "'");
        }
    }

    public static void ejercicio02(String cadena) {
        /*
        Ejercicio 2
Realizar un programa que comprueba si una cadena leída por teclado comienza por una
subcadena introducida por teclado.
         */
        System.out.println("\nEjercicio 2");
        System.out.println("===========");
        System.out.println("Introduce ahora la subcadena:");
        String subcadena = sc.nextLine();
        System.out.println(cadena.startsWith(subcadena)); // "Esto es todo".startsWith("Esto no"); --> true
    }

    public static void ejercicio03(String cadena) {
        /*
        Ejercicio 3
Reemplazar caracteres: escribe un programa que lea una cadena de texto y reemplace
todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena
resultante.
         */
        System.out.println("\nEjercicio 3");
        System.out.println("===========");
        cadena = cadena.replace("a", "i");
        System.out.println(cadena);
    }


    public static void ejercicio04(String cadena) {
        /*
        Ejercicio 4
Comprobar si termina con...: escribe un programa que lea el nombre de una ciudad y
compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false.
         */



    }

    public static void ejercicio05(String cadena) {
        /*
        Ejercicio 5
Comprobar si comienza con... ignorando mayúsculas y minúsculas: escribe un programa
que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en
mayúsculas o minúsculas. El programa debe imprimir true o false.
         */


    }

    public static void ejercicio06(String cadena) {
        /*
        Ejercicio 6
Comparar cadenas ignorando los espacios en blanco: escribe un programa que lea dos
cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería
imprimir true si son iguales, false en caso contrario.
         */


    }

    public static void ejercicio07(String cadena) {
        /*
            Ejercicio 7
Extraer una subcadena: escribe un programa que lea una cadena y dos números enteros
para indicar los límites inferior y superior respectivamente de un rango dentro de las
posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango: a)
suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la
longitud de la cadena; b) Validando que sucede a).
         */


    }

}
