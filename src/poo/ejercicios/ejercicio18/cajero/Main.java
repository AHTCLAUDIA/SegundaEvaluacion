package poo.ejercicios.ejercicio18.cajero;

public class Main {
    public static void main(String[] args) {

//Escribe un programa que compruebe el funcionamiento de ambos métodos.


        // Vamos a crear un objeto con el primer constructor:
        CuentaCorriente cc1 = new CuentaCorriente("11111111A", 1000);
        // vamos a ver si lo hemos creado bien mostrando los datos de este objeto
        cc1.mostrarInformacion();
        System.out.println();

        // Probamos a crear un objeto con el segundo constructor:
        CuentaCorriente cc2 = new CuentaCorriente("22222222B", "B.Blazquez", 1000);
        cc2.mostrarInformacion();


//Escribe un programa para comprobar la visibilidad de los atributos. --> intentamos ver los atributos de cada objeto
        System.out.println(cc1.nombre); // ok, visible, es public
        System.out.println(cc1.DNI); // ok, visible -- es default package y los estamos llamamos desde el mismo paquete
        //System.out.println(cc1.saldo); no es visible de otra clase, ni siquiera en el mismo paquete (private)
        System.out.println(cc1.getSaldo());

        // Quiero ver el banco de todas las cuentas
        System.out.println(CuentaCorriente.banco); // al ser static tengo que invocarlo desde otra clase con el nombre de la clase a la que pertenece, no con el nombre del objeto

        // Probamos el constructor con nombre y DNI
        CuentaCorriente cc3 = new CuentaCorriente("33333333C", "C. Calvo"); // creamos un objeto que, por los parámetros que le ponemos, está invocando al primer constructor
        // mostramos sus datos:
        System.out.println();
        cc3.mostrarInformacion();
        System.out.println();
        // Probamos el método retirarDinero
        cc1.retirarDinero(1500);
        System.out.println();
        cc1.retirarDinero(750);
        cc1.ingresarDinero(5000);

        // Vamos a probar los dos constructores de gestor: creamos dos gestores, uno con cada uno
        Gestor g1 = new Gestor("G. González", "123456789", 100_000);

        // Para  ver los valores de sus atributos, como no hemos creado un método para ello, lo hacemos aquí "a mano"
        System.out.println("\nDatos del primer gestor:" + g1.nombre + "(" + g1.telefono + ") Importe máximo: " + g1.importeMax);

        // Probamos el segundo constructor
        Gestor g2 = new Gestor("G. García", "666666666");
        System.out.println("\nDatos del segundo gestor:" + g2.nombre + "(" + g2.telefono + ") Importe máximo: " + g2.importeMax);

        // Vamos a probar que no podemos cambiar el teléfono
        g1.nombre = "H. Hernández"; // no problem porque es default package y estamos en el mismo paquete
        //g1.telefono = "5555555"; // no nos deja porque lo hemos puesto final, una vez asignado un valor no deja cambiarlo


        // Vamos a asignar un gestor a cada una de las cuentas que tenemos
        System.out.println("\nAsignamos un gestor a una cuenta y mostramos su información");
        cc2.setGestor(g2);
        cc2.mostrarInformacion();


    }
}
