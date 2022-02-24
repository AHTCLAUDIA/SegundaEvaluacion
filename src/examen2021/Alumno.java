package examen2021;

import java.util.ArrayList;

/*
Es una persona
 */
public class Alumno extends Persona{
    /*
    Aparte de los atributos que hereda, tiene un curso y un
ArrayList de asignaturas matriculadas.
     */
    Curso curso;
    ArrayList<Asignatura> asignaturasMatriculadas = new ArrayList<>();

    /*
     Tiene un constructor con dos parámetros: nombre y dni.
     */
    public Alumno(String dni, String nombre) {
        super(dni, nombre);
    }

    /*
    Tiene un método matricular, que recibe un curso y se lo asigna al alumno.
además, en este método rellenamos el array de asignaturas matriculadas por el alumno con todas las
asignaturas que componen el curso en el que se matricula.
     */
    public void matricular(Curso curso) {
        this.curso = curso;
        this.asignaturasMatriculadas.addAll(curso.asignaturasCurso);
        /*
        Cada vez que se matricula un alumno en un curso, el
número de plazas disponibles en el curso disminuye en
una unidad.
         */
        curso.plazasDisponibles--;
        /*
        Al finalizar, informa de la matriculación del alumno.
         */
        System.out.println("El alumno se ha matriculado correctamente.");
    }

    /*
    Tiene un método convalidarAsignatura, que recibe el
nombre de la asignatura a convalidar y elimina la
asignatura del ArrayList de asignaturas matriculadas del
alumno. Finalimente, informa de la convalidación
realizada.
     */
    public void convalidarAsignatura(String nombreAsignatura) {
        for (int i = 0; i < asignaturasMatriculadas.size(); i++) {
            if (asignaturasMatriculadas.get(i).nombre.equals(nombreAsignatura)) {
                asignaturasMatriculadas.remove(i);
            }
        }
    }


    /*
    Tiene un método mostrarAsignaturasMatriculadas(), que
muestra las asignaturas matriculadas por el alumno.
     */
    public void mostrarAsignaturasMatriculadas() {
        System.out.println("ASIGNATURAS MATRICULADAS POR " + this.getNombre());
        System.out.println("================================================");
        for (int i = 0; i < asignaturasMatriculadas.size(); i++) {
            System.out.println(asignaturasMatriculadas.get(i).nombre + " (" + asignaturasMatriculadas.get(i).horas + ") horas.");
        }
    }

    /*
    Tiene un método toString(), que invoca al método del
mismo nombre de la superclase.
     */

    @Override
    public String toString() {
        return super.toString();
    }
}
