package examen2021;

public class Main {
    public static void main(String[] args) {
        /*
        Prueba: en el main, crea un profesor, hazlo tutor e imprime sus
datos.

         */
        Profesor pablo = new Profesor("0222336D", "Pablo");
        pablo.asignarTutoria();
        System.out.println(pablo);

        /*
        Prueba: en el main, crea el curso 1º DAW, asígnale como tutor el
profesor que has creado anteriormente, muestra la información
del curso.
         */
        Curso daw1 = new Curso(CicloFormativo.DAW, 1);
        daw1.setTutor(pablo);
        daw1.mostrarInformaciónCurso();

        /*
        Prueba: en el main, crea dos alumnos, matricúlalos en 1º de DAW,
convalida FOL al primero de los dos alumnos, muestra las
asignaturas matriculadas para cada uno de ellos y muestra las
plazas disponibles en el curso 1º DAW.
         */
        Alumno alumno = new Alumno("02223344B", "Fermín");
        Alumno alumna = new Alumno("1112233Q", "Sinforosa");
        alumno.matricular(daw1);
        alumna.matricular(daw1);
        alumno.convalidarAsignatura("FOL");
        alumno.mostrarAsignaturasMatriculadas();
        alumna.mostrarAsignaturasMatriculadas();
        daw1.mostrarPlazasDisponibles();


    }
}
