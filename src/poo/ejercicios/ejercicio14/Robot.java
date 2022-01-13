package poo.ejercicios.ejercicio14;

public class Robot {
    /*
    Crea una clase Robot con dos atributos de tipo String: nombre y modelo, y un
atributo int duración.
Añade tres constructores:
• Un constructor sin parámetros que cree objetos de nombre “Anónimo” y modelo
“Desconocido” (no modifica el valor por defecto de duración).
• Un constructor con (tres) parámetros que, recibe valores e inicializa canda uno de los
tres atributos de los objetos que se crean.
• Un constructor con (dos) parámetros que recibe por parámetro nombre y modelo al
crearse un objeto. En el cuerpo del constructor invocamos al constructor de tres
parámetros, con el nombre y modelo recibidos y una duración de 20 años.
Crea en el mismo fichero una clase Main en la cual creamos tres robots, uno con cada
constructor, y mostramos sus propiedades.
     */

    // atributos privados --> métodos get y set
    private String nombre;
    private String modelo;
    private int duracion;

    // Constructores
    public Robot() {
        this.nombre = "Anónimo";
        this.modelo = "Desconocido";
        // innecesario -> duracion = 0;
    }

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    public Robot(String nombre, String modelo) {
        this(nombre, modelo, 20); // si tienes que llamar al constructor desde otro constructor de la misma clase utilizas esta forma: this(parámetros)

        // también vale: new Robot( this.nombre=nombre, this.modelo=modelo, this.duracion=20);
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

class Main {
    public static void main(String[] args) {
        
        Robot wallE = new Robot();
        System.out.println("Primer robot (sin parámetros)");
        System.out.println(wallE.getNombre());
        System.out.println(wallE.getModelo());
        System.out.println(wallE.getDuracion());
        
        Robot eva = new Robot("Eva", "kjasdrr", 1000);
        System.out.println("Segundo robot (tres parámetros)");
        System.out.println(eva.getNombre());
        System.out.println(eva.getModelo());
        System.out.println(eva.getDuracion());

        Robot R2D2 = new Robot("R2D2", "StarWars-15800");
        System.out.println("Tercer robot (dos parámetros)");
        System.out.println(R2D2.getNombre());
        System.out.println(R2D2.getModelo());
        System.out.println(R2D2.getDuracion());
        
    }
}
