package herencia.ejemplos.ej3;

public class Mamífero {

    public String saludar(){ // lo sobreescribimos en las subclases
        return "el mamífero te saluda";
    }

    // vamos a poner un método que no queremos que se sobreescriba
    // en ninguna subclase (final)
    public final void metodoFinal(){
        System.out.println("Esto no se cambia");
    }
}
