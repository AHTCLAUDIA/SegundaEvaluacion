package cadenas;

import java.util.Arrays;
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
        //ejercicio03(cadena);
        //ejercicio04(cadena);
        //ejercicio05(cadena);
        //ejercicio06(cadena);
        //ejercicio07(cadena);
        //ejercicio08(cadena);
        //ejercicio09(cadena);
        //ejercicio10(cadena);
        //ejercicio11(cadena);
        ejercicio12(cadena);

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
        System.out.println("\nEjercicio 4");
        System.out.println("===========");
        boolean resultado = cadena.endsWith("burgo");
        System.out.println(resultado);
    }

    public static void ejercicio05(String cadena) {
        /*
        Ejercicio 5
Comprobar si comienza con... ignorando mayúsculas y minúsculas: escribe un programa
que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en
mayúsculas o minúsculas. El programa debe imprimir true o false.
         */
        System.out.println("\nEjercicio 5");
        System.out.println("===========");
        String primeraLetra = cadena.substring(0, 1);
        //System.out.println(primeraLetra);
        boolean empiezaPorJ = primeraLetra.equalsIgnoreCase("J");
        System.out.println(empiezaPorJ);


        // Forma más resumida:
        //System.out.println(cadena.substring(0,1).equalsIgnoreCase("J"));
    }

    public static void ejercicio06(String cadena) {
        /*
        Ejercicio 6
Comparar cadenas ignorando los espacios en blanco: escribe un programa que lea dos
cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería
imprimir true si son iguales, false en caso contrario.
         */
        System.out.println("\nEjercicio 6");
        System.out.println("===========");

        System.out.println("Introduce otra cadena.");
        String otraCadena = sc.nextLine();
        // TRUCO: suprimir los espacios en blanco en ambas cadenas y después compararlas
        String cadena1SinEspacios = cadena.replace(" ", "");
        String cadena2SinEspacios = otraCadena.replace(" ", "");
        System.out.println(cadena1SinEspacios.equals(cadena2SinEspacios));
    }

    public static void ejercicio07(String cadena) {
        /*
            Ejercicio 7
Extraer una subcadena: escribe un programa que lea una cadena y dos números enteros
para indicar los límites inferior y superior respectivamente de un rango dentro de las
posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango: a)
suponiendo que ambos números siempre son mayores o iguales a 0 y menores que la
longitud de la cadena; b) Validando que sucede a).
         */
        System.out.println("\nEjercicio 7");
        System.out.println("===========");
        int inf, sup;
        do {
            // pedir dos números enteros: inf, sup
            System.out.println("Límite inferior:");
            inf = sc.nextInt();
            System.out.println("Límite superior:");
            sup = sc.nextInt();
            // hacemos una prueba antes de salir del bucle para informar del error si lo hay
            if (inf < 0 || sup > cadena.length() || inf > cadena.length() || sup < 0) {
                System.out.println("Te has salido del rango. Vuelve a introducir los números.");
            }
        } while (inf < 0 || sup > cadena.length() || inf > cadena.length() || sup < 0); // si introducen los datos mal, sigo en el bucle

        // si introduce bien los datos, hago to-do
        // extraigo subcadena y la imprimo
        String subcadena = cadena.substring(inf-1, sup); // 3, 9
        System.out.println(subcadena);


       /*
       if (inf < 0 || sup > cadena.length()) {
            System.out.println("Te sales de la cadena");
        } else {
            // si introduce bien los datos, hago to-do
            // extraigo subcadena y la imprimo
            String subcadena = cadena.substring(inf-1, sup); // 3, 9
            System.out.println(subcadena);
        }
        */
    }

    public static void ejercicio08(String cadena) {
        /*
        Ejercicio 8
Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las
iniciales en mayúsculas.
         */

        // TRUCO: nombre y apellidos están separados por un espacio
        String[] trozos = cadena.split(" ");

        //System.out.println(Arrays.toString(trozos));

        // Imprimo el primer carácter de cada elemento del array
        for (int i = 0; i < trozos.length; i++) {
            System.out.print(trozos[i].substring(0,1).toUpperCase());
        }

    }

    public static void ejercicio09(String cadena) {
        /*
        Ejercicio 9
Realizar un programa que, dada una cadena de caracteres, genere otra cadena resultado de
invertir la primera.
         */
    String inversa = "";
    for (int i = cadena.length()-1; i >= 0; i--) {
        inversa = inversa + cadena.charAt(i);

        System.out.println(inversa);
    }
    }

    public static void ejercicio10(String cadena) {
        /*
        Ejercicio 10
Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la
aparición del primer carácter en la cadena por el segundo carácter.
         */

        // pedir dos caracteres
        System.out.println("Introduce primer carácter:");
        char c1 = sc.nextLine().charAt(0);
        System.out.println("Introduce segundo carácter:");
        char c2 = sc.nextLine().charAt(0);

        // como el replace no lo puedo utilizar porque reemplazaría todos
        // y no puedo hacer una sustitución directa en la cadena
        // lo que voy a hacer es convertir el String en un array de caracteres
        char[] caracteres = new char[cadena.length()];

        // ahora vamos rellenando el array de caracteres con los caracteres de la cadena
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = cadena.charAt(i);
        }

        //ahora ya tengo un array de caracteres y puede hacer sustituciones concretas
        // ahora busco la primera aparción del carácter c1
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == c1) {
                // cuando encuentro un carácter igual al primero introducido, lo sustituyo por el segundo
                caracteres[i] = c2;
                break;
            }
        }

        // imprimimos
        //System.out.println(Arrays.toString(caracteres)); // queda feo impreso, pero por no seguir con esto

        for (char carácter: caracteres) {
            System.out.print(carácter);
        }

    }

    public static void ejercicio11(String cadena) {
        /*
        Ejercicio 11
Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
minúsculas y viceversa.
         */
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLowerCase(cadena.charAt(i))) { // si el carácter que toca es minúscula
                System.out.print(Character.toUpperCase(cadena.charAt(i))); ; // lo imprimo (ese carácter) como mayúscula
            } else { // si no, es que es mayúscula
                System.out.print(Character.toLowerCase(cadena.charAt(i))); ; // lo imprimo (ese carácter) como minúscula
            }
        }
    }

    public static void ejercicio12(String cadena) {
        /*
        Ejercicio 12
Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
cadenas se introducen por teclado.
         */
        // PEDIMOS UNA CADENA (VAMOS A COMPROBAR SI ESTÁ CONTENIDA EN cadena
        System.out.println("Introduce una subcadena");
        String subcadena = sc.nextLine();

        // tenemos que comprobar si subcadena está dentro de cadena
        System.out.println(cadena.contains(subcadena));  // si lo quiero mejorar puedo utilizar un if con información sobre el resultado

    }

    public static void ejercicio13(String cadena) {
        /*
        Ejercicio 13
Introducir una cadena de caracteres e indicar si es un palíndromo. Un palíndroma
es aquella que se lee igual adelante que atrás.
         */

        // Dabale arroz a la zorra el abad

        // 1. Quito los espacios --> crear un método quitarEspacios que recibe una cadena y devuelve otra cadena (que es la cadena introducida, pero sin espacios)
                // llamamos a ese método y recogemos el resultado en una variable de tipo Strings


        // 2. Creo otra cadena que sea la misma pero invertida --> crear

        // 3. Las comparo


    }

    public static void ejercicio14(String cadena) {
        /*
        Ejercicio 14
Suponiendo que hemos introducido una cadena por teclado que representa una frase
(palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene.
         */

    }

    public static void ejercicio15(String cadena) {
        /*
        Ejercicio 15
Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la
cadena.
         */

    }

}
