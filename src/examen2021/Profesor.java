package examen2021;

public class Profesor extends Persona{
    boolean tutor;

    public Profesor(String dni, String nombre) {
        super(dni, nombre);
    }

    /*
    Tiene un método asignarTutoría(), que cambia el valor del
atributo correspondiente para hacer que un profesor sea
tutor.
     */
    public void asignarTutoria() {
        tutor = true;
    }

    /*
    También tiene un método toString() que invoca al método
de igual nombre de la superclase.
     */

    @Override
    public String toString() {
        String s = super.toString();
        return s;
    }
}
