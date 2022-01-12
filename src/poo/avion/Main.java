package poo.avion;

public class Main {
    public static void main(String[] args) {
        Avion airbus = new Avion("Airbus", 200, 800,40.4165,-3.70256);
        Avion boeing777 = new Avion("Boeing 777", 200, 800,40.4165,-3.70256);
        // Volamos con el airbus a París
        airbus.imprimirDatos();
        airbus.transportar(48.85341, 2.3488);
        airbus.imprimirDatos();
        // Volamos con el boeing a Nueva York
        boeing777.imprimirDatos();
        boeing777.transportar(40.71427,  -74.00597);
        boeing777.imprimirDatos();
    }
}
