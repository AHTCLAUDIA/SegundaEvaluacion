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
    }
}
