package ferroviaria;



import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;
import ferroviaria.personal.Especialidad;
import ferroviaria.personal.JefeDeEstación;
import ferroviaria.personal.Maquinista;
import ferroviaria.personal.Mecánico;

import java.time.LocalDate;

import static ferroviaria.maquinaria.Locomotora.locomotoras;
import static ferroviaria.maquinaria.Tren.trenes;
import static ferroviaria.personal.JefeDeEstación.jefes;
import static ferroviaria.personal.Maquinista.maquinistas;
import static ferroviaria.personal.Mecánico.mecánicos;


public class Main {
    public static void main(String[] args) {
        // Simulamos una estación: creamos objetos de diversos tipos:
        // dos maquinistas
        Maquinista m1 = new Maquinista("Pepe", "11111111P", 42000,1);
        Maquinista m2 = new Maquinista("Marta", "22222222M", 42000,1);
        m1.imprimirDatos();
        m2.imprimirDatos();


        // un mecánico de cada especialidad
        Mecánico mecánicoFrenos = new Mecánico("F. Frenador", "389177612", Especialidad.FRENOS);
        Mecánico mecánicoHidráulico = new Mecánico("H. Hidráulico", "389177612", Especialidad.HIDRÁULICA);
        Mecánico electricista = new Mecánico("E. Electricista", "12345767", Especialidad.ELECTRICIDAD);
        Mecánico mecánicoMotor = new Mecánico("M. Motorista", "1451254234213", Especialidad.MOTOR);
        mecánicoFrenos.imprimirDatos();
        mecánicoHidráulico.imprimirDatos();
        electricista.imprimirDatos();
        mecánicoMotor.imprimirDatos();

        // Un jefe de estación
        JefeDeEstación jefe = new JefeDeEstación("El Boss", "22222222D", LocalDate.of(2019, 12,1));
        jefe.imprimirDatos();

        // Una locomotora
        Locomotora locomotoraAve = new Locomotora("M3085",350, 2020, mecánicoFrenos);
        locomotoraAve.imprimirDatos();

        // Un tren
        Tren ave = new Tren(locomotoraAve);
        ave.imprimirDatos();
        boolean terminar = false;

        // Añadimos un vagón al tren
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");
        for (int i = 0; i < 6; i++) {
            ave.añadirVagón();
        }

        // Le asignamos un maquinista
        System.out.println("\n*****     Le asignamos un maquinista *****");
        ave.setMaquinista(m1);
        ave.imprimirDatos();

        // Mostramos los datos del tren creado
        System.out.println("Número de vagones: " + ave.getVagones());
        ave.imprimirDatos();

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        ave.eliminarVagon();
        System.out.println("Número de vagones: " + ave.getVagones());
        ave.imprimirDatos();

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");
        System.out.println(jefes + " Jefe de Estación");
        System.out.println(maquinistas + " maquinistas");
        System.out.println(mecánicos + " mecánicos");
        System.out.println(locomotoras + " locomotoras");
        System.out.println(trenes + " trenes");

    }
}
