package poo.ejercicios.ejercicio18.cajero;

public class Gestor {

// Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.
// Cada cuenta, en caso de tenerlo, cuenta con un único gestor.

//Diseñar la clase Gestor de la que interesa guardar
// su nombre,  El nombre será público
    public String nombre;
// teléfono //iii. Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo.
    public final String telefono; // public porque to-do el mundo puede consultarlo; final porque una vez asignado se hace constante
// y el importe máximo autorizado con el que pueden operar. y el importe máximo sólo será visible por clases que estén en el mismo paquete = default package
   float importeMax;


// Con respecto a los gestores, existen las siguientes restricciones:
//i. Un gestor tendrá siempre un nombre y un teléfono. --> cada vez que creo un objeto gestor le tengo que dar esos dos valores
//ii. Si no se asigna, el importe máximo autorizado por operación será de 10000 euros. --> yo aquí pienso en dos constructores: en uno le damos importeMax y en otro no

    public Gestor(String nombre, String telefono, float importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }

    // hacemos otro constructor sin importe máximo

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = 10_000; //ii. Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
    }

}
