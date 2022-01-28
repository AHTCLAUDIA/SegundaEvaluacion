package herencia.ejemplos.ej3;

public class Gato extends Mamífero{

    // el gato saluda de forma personalizada

    @Override
    public String saludar() {
       // return super.saludar(); si lo dejo así, lo haría igual que el método de la superclase
        // y yo lo quiero personalizar, que para eso lo estoy sobreescribiendo
        return "Miau";
    }

    // ya hemos sobreescrito el método saludar
    // es decir, se va a llamar igual PERO cambiamos algún parámetro ==> sobrecarga
    public String saludar(int n) {
        String cadena = "miau";
        for (int i = 0; i < n; i++) {
            cadena = cadena + " " + "miau";
        }
        return cadena;
    }

    /*public final void metodoFinal(){
     no me deja sobreescribirlo
    }*/
}
