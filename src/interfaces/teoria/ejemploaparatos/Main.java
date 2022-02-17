package interfaces.teoria.ejemploaparatos;

public class Main {
    public static void main(String[] args) {
       // Aparato a = new Aparato();
        Kettle tetera = new Kettle("T01", 2);
        tetera.on();
        mostrarEstado(tetera);
        tetera.off();
        mostrarEstado(tetera);
    }

    // Meto un método estático para mostrar el estado de la tetera
    public static void mostrarEstado(Kettle k) {
        if (k.on) {
            System.out.println("La tetera está encendida");
        } else {
            System.out.println("La tetera está apagada");
        }
    }
}
