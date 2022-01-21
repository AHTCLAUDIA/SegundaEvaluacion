package poo.ejercicios.ejercicio19.enumerados;

public class Enumerados {
    // A) Dentro de esta clase declaramos el enumerado con las estaciones de año
    enum Estaciones {
        PRIMAVERA,
        VERANO,
        OTOÑO,
        INVIERNO
    }

    // Enumerado con las partes del día
    enum PartesDelDia {
        MAÑANA,
        MEDIODIA,
        TARDE,
        NOCHE
    }

    // Enumerado con las comidas del día
    enum Comidas {
        DESAYUNO,
        ALMUERZO,
        MERIENDA,
        CENA
    }

    // Método main con una variable de cada uno de los enumerados
    // y asignamos un valor determinado a cada una
    public static void main(String[] args) {
        Estaciones ahora = Estaciones.INVIERNO;
        PartesDelDia ahorita = PartesDelDia.TARDE;
        Comidas luego = Comidas.CENA;

        // Guardas en un array todas las constantes de cada enumerado
        Estaciones[] estaciones = Estaciones.values();
        // hemos pasado los valores del enum al array,
        // por ejemplo, para poder mostrarlos
        System.out.println("Estaciones:");
        System.out.println("============");
        for (int i = 0; i < estaciones.length; i++) {
            System.out.println(estaciones[i] + " ");
        }

        PartesDelDia[] partesDia = PartesDelDia.values();
        System.out.println("Partes del día:");
        System.out.println("===============");
        for (int i = 0; i < partesDia.length; i++) {
            System.out.println(partesDia[i] + " ");
        }

        Comidas[] comidas = Comidas.values();
        System.out.println("Comidas del día:");
        System.out.println("================");
        for (Comidas elemento: comidas) {
            System.out.println(elemento + " ");
        }
    }
}
