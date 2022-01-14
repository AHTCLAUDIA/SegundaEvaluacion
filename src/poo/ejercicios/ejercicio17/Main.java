package poo.ejercicios.ejercicio17;

public class Main {
    public static void main(String[] args) {
        Unidad u1 = new Unidad("1");
        Unidad u2 = new Unidad("2");
        Unidad u3 = new Unidad("3");
        Unidad u4 = new Unidad("4");
        Unidad u5 = new Unidad("5");

        Caballero c1 = new Caballero("Furia");
        Caballero c2 = new Caballero("Beauty");
        Caballero c3 = new Caballero("Pegaso");

       General g = new General("Mandamucho");

        Médico m = new Médico("House");

        System.out.println("Mi ejército tiene:");
        System.out.println(Unidad.unidades + " unidades"); // muestro el valor de la variable estática (de la clase Unidad)
        System.out.println(Caballero.caballeros + " caballeros");
        System.out.println(General.generales + " generales");
        System.out.println(Médico.médicos + " médicos");
    }
}
