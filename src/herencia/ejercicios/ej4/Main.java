package herencia.ejercicios.ej4;

public class Main {
    public static void main(String[] args) {
        Mascota gato = new Gato();
        gato.setEdad(5); // ok
        gato.getNombre(); // ok
        //gato.getColor(); // ko
        gato.getEdad();
        //gato.setColor("Gris"); // ko
        gato.setNombre("Faraón"); //ok

    }
}
