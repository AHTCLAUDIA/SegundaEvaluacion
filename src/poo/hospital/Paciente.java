package poo.hospital;

public class Paciente {
    // Atributos: guardan datos que necesitemos saber de cada paciente
    // aquí no guardamos ningún valor; los valores los daremos cuando
    // creemos objetos a partir de esta plantilla
    private String nombre;
    private int edad;
    private String codigoSS;
    private String[] síntomas;

    // Lo normal es tener un método constructor
    // Para inicializar los objetos a la vez que los creamos

    public Paciente() { // constructor sin parámetros
        // no inicializa valores, los tengo que asignar después de crear el objeto
    }

    public Paciente(String nombre, int edad, String codigoSS, String[] síntomas) {
        // asigna a "este" objeto (el que se crea al llamar a este constructor) los atributos
        //  this === "este objeto"
        this.nombre = nombre;
        this.edad = edad;
        this.codigoSS = codigoSS;
        this.síntomas = síntomas;
        // atributo = parámetro, es decir, asigno al atributo del objeto el parámetro que entra por el ()
    }

    // Los constructores pueden tener muchas formas y más o menos parámetros
    // Queremos crear un constructor para pacientes que no saben su nº ss
    // vamos a crear un constructor que asigne el 666 siempre al no ss


    public Paciente(String nombre, int edad, String[] síntomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.síntomas = síntomas;
        this.codigoSS = "666";
    }

    // Método que muestra los datos de cada paciente
    // lo dejo aquí para cuando cuente los métodos de instancia

    // get me dice qué valor tiene el atributo en ese objeto
    public String getNombre() {
        return nombre;
    }

    // set --> sirven para cambiar el valor de un atributo para el objeto que lo llame
    public void setNombre(String nombre) { // en el parámetro pones el valor que tomará ahora el atributo
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigoSS() {
        return codigoSS;
    }

    public void setCodigoSS(String codigoSS) {
        this.codigoSS = codigoSS;
    }

    public String[] getSíntomas() {
        return síntomas;
    }

    public void setSíntomas(String[] síntomas) {
        this.síntomas = síntomas;
    }
}


