package herencia.ejemplos.ej5;

public class Main {
    public static void main(String[] args) {
        // Intentamos crear un objeto de la clase abstracta
        //Mascota m = new Mascota("Otilio", 1); // no me deja porque es una clase abstracta

        //Creamos un gato
        Gato garfield = new Gato("Garfield", 5);
        garfield.dice();
        garfield.imprimirDatos();

        // Creamos un perro
        Perro pluto = new Perro("Pluto", 150, true);
        pluto.dice();
        pluto.imprimirDatos();
        System.out.println(pluto.toString()); // no imprime lo de la pelota porque no lo hemos sobreescrito en la subclase
    }
}
