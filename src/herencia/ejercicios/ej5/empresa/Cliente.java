package herencia.ejercicios.ej5.empresa;

public class Cliente extends Persona{
    String telefonoContacto;

    public Cliente(String nombre, int edad, String telefonoContacto) {
        super(nombre, edad);
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return "Persona: " + "\nnombre: " + nombre + "\nedad=" + edad + "\ntelefono=" + telefonoContacto;
    }

    @Override
    public void mostrar() {
        //super.mostrar();
        System.out.println(toString());
    }
}
