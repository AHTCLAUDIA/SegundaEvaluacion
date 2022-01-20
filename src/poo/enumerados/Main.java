package poo.enumerados;

public class Main {
    public static void main(String[] args) {
        // para utilizarlos, los declaramos como un objeto o una variable más
        Estado a = Estado.ACTIVO;
        // NORMALMENTE LOS UTILIZAMOS DENTRO DE CLASES, NO DIRECTAMENTE EN main


        // Qué métodos podemos utilizar
        // si quieres recuperar el valor concreto de una variable enumerado
        System.out.println("Métodos enumerado: ");
        System.out.println("====================");
        System.out.println("name(): " + a.name());

        // values() --> podemos guardar todos los valores de un enumerado en un array
        // es como convertir un enum en un array
        Estado[] estados = Estado.values();
        // y entonces este array lo puedes recorrer con un for
        for (int i = 0; i < estados.length; i++) {
            System.out.println("Valor " + i + ": " + estados[i]);
        }

        if (a.equals(Estado.ACTIVO)) {
            System.out.println("Estás activo");
        }
    }
}
