import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    // crear un Scanner estático
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // lo primero es crear la palabra secreta
        // llamando al método y guardando el resultado
        char[] palabra =  crearPalabraSecreta();

        // necesitamos un contador para los intentos
        int intentos = 6; // a medida que fallemos irá bajando
        pintarAhorcado(intentos);
        // necesitamos otro char[] para guardar y mostrar las letras adivinadas
        // es del tamaño de la palabra a adivinar

        char[] adivinadas = new char[palabra.length];
        // lo inicializamos con '_'
        Arrays.fill(adivinadas, '_'); // **NOVEDAD**

        /*
        // Otra forma de rellenar el array es
        for (int i = 0; i < adivinadas.length; i++) {
            adivinadas[i] = '_';
        }
        System.out.println(Arrays.toString(adivinadas));
         */

        System.out.println("************** JUGADOR 2 ***************");
        System.out.println("****************************************");

        // con un do-while simulo cada jugada
        // mientras los intentos sean > 0, seguimos
        do { // cada vuelta es una jugada
            // pido una letra
            System.out.print("Adivinar: ");
            for (int i = 0; i < adivinadas.length; i++) {
                System.out.print(adivinadas[i]);
            }
            System.out.println();

            char letra = sc.next().toLowerCase().charAt(0);
            // miro si está en la palabra secreta
            boolean está = false; // si la letra está se pondrá a true; si no, seguirá como false y descontaremos un intento
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) { // si en esa posición la letra coincide con la de la palabra
                // si está, reemplazo '_' por la letra
                adivinadas[i] = letra;
                está = true;
            }
        }
        //System.out.println(Arrays.toString(adivinadas));

            // si he terminado de recorrer la palabra y la letra no está, descuento un intento
           if  (!está) { // es lo mismo que está == false
               intentos--;
               System.out.println(intentos);
               pintarAhorcado(intentos);
           }

        // cada vez que termino una jugada compruebo si he ganado
        if (Arrays.equals(palabra, adivinadas)) { // antes de terminar la jugada compruebo si he ganado
            System.out.println("¡¡¡¡ GANASTE !!!!");
            break;
        }
        // si recorro to-do y no está, tengo un intento menos y pinto el ahorcado
            String p = "";
            for (int i = 0; i < palabra.length; i++) {
                p = p + palabra[i];
            }
            System.out.println("La palabra era: " + p);

        } while (intentos > 0);
    }

    public static char[] crearPalabraSecreta() {
        // pido al jugador 1 la palabra a adivinar
        System.out.println("************** JUGADOR 1 ***************");
        System.out.println("****************************************");
        System.out.println("Introduce la palabra a averiguar:");
        String palabra = sc.next();

        // la convierto en array de char:
       char[] adivinar = palabra.toCharArray();
        //System.out.println(Arrays.toString(adivinar));
        return adivinar; // devolvemos la palabra a adivinar como un char[]
    }

    public static void pintarAhorcado(int intentos) {
        switch (intentos) {
            case 0: // pinto el ahorcado completo; he perdido
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O");
                System.out.println("|  -|-");
                System.out.println("|  /\\");
                System.out.println("|   ");
                System.out.println("========");
                System.out.println("---- PERDISTE ---- :(");
                break;
            case 1:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O");
                System.out.println("|  -|-");
                System.out.println("|  /");
                System.out.println("|   ");
                System.out.println("========");
                break;
            case 2:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O");
                System.out.println("|  -|-");
                System.out.println("|  ");
                System.out.println("|   ");
                System.out.println("========");
                break;
            case 3:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O");
                System.out.println("|  -|");
                System.out.println("|  ");
                System.out.println("|   ");
                System.out.println("========");
                break;
            case 4:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O");
                System.out.println("|   |");
                System.out.println("|  ");
                System.out.println("|   ");
                System.out.println("========");
                break;
            case 5:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   O");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|   ");
                System.out.println("========");
                break;
            case 6:
                System.out.println("+---+");
                System.out.println("|   |");
                System.out.println("|   ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|   ");
                System.out.println("========");
                break;
        }
    }
}
