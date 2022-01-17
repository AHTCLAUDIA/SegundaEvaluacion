package poo.ejercicios.ejercicio16.banco;

public class Main {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("demo", "Ale", "Chim Pom");
        Cuenta c = new Cuenta("123456", 1000, propietario);

        // Para probar el método, lo llamamos con la cuenta creada
        mostrarCuenta(c);
    }

    public static void mostrarCuenta(Cuenta cuenta) {
        System.out.println("Datos de la cuenta: ");
        System.out.println("=====================");
        System.out.println("* Código:\t" + cuenta.getCódigo());
        System.out.println("* Balance:\t" + cuenta.getBalance());
        System.out.println("* Datos del propietario:");
        System.out.println("    Nombre:" + cuenta.getPropietario().getNombre());
        System.out.println("    Apellidos: " + cuenta.getPropietario().getApellidos());
    }
}
