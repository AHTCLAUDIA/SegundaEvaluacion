package poo.ejercicios.ejercicio18.cajero;

// //vi. Modifica si es necesario la visibilidad de la clase CuentaCorriente para
////que sea visible desde clases externas
class CuentaCorriente {

   // CuentaCorriente, que almacena los datos: datos = atributos
// y la visibilidad de sus atributos para que:


    // DNI, dni sólo sea visible por clases del mismo paquete
    String DNI;
    // nombre del titular nombre sea público para cualquier clase
    public String nombre;
    // y saldo. saldo no sea visible para otras clases
    private float saldo;

    //vii. Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. --> banco no es particular de cada cuenta, sino que es de toda la clase --- es un atributo estático
    // Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
    static String banco = "International Java Bank";

// Diseñar un método que permita recuperar y modificar el nombre del banco --> getter y setter


    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    //i. Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0. --> crear un objeto de tipo CuentaCorriente
    public CuentaCorriente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        // El saldo inicial será 0.
        this.saldo = 0;
    }

    // Sobrecarga los constructores para poder crear objetos:
    //1. Con el DNI del titular de la cuenta y un saldo inicial.
    public CuentaCorriente(String DNI, float saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    //2. Con el DNI, nombre y el saldo inicial.
    public CuentaCorriente(String DNI, String nombre, float saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // como saldo es private para poder conocer el saldo desde otra clase necesito un getter
    public float getSaldo() {
        return saldo;
    }

    //Mostrar información: muestra la información disponible de la cuenta corriente.
    public void mostrarInformacion() {
        System.out.println("Información de la cuenta");
        System.out.println("========================");
        System.out.println("Nombre:\t" + this.nombre);
        System.out.println("DNI:\t" + this.DNI);
        System.out.println("Saldo:\t" + this.saldo + " euros.");
        System.out.println("Banco:\t" + banco);
    }

    // Las operaciones típicas con una cuenta corriente son: --> los métodos de la clase

    //ii. Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    public void retirarDinero(float cantidad) {
        // vemos si tenemos saldo suficiente
        if (cantidad >= saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo = saldo - cantidad;
            System.out.println("Operación ralizada correctamente. Saldo actual: " + saldo + " euros.");
        }
    }

    //iii. Ingresar dinero: se incrementa el saldo.
    public void ingresarDinero(float cantidad) {
        saldo = saldo + cantidad;
        System.out.println("\n Operación realizada correctamente. Saldo actual: " + saldo);
    }
}
