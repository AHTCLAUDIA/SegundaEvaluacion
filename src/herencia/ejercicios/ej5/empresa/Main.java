package herencia.ejercicios.ej5.empresa;

import org.demo.A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("A", 18, 15000);
        empleado1.mostrar();
        System.out.println();
        Empleado empleado2 = new Empleado("B", 19, 16000);
        empleado2.mostrar();
        System.out.println();
        Directivo directivo = new Directivo("C", 20, 20000, Categoria.CEO);
        directivo.mostrar();
        System.out.println("\n\n");


        ArrayList<Empleado> e = new ArrayList<>();
        e.add(empleado1);
        e.add(empleado2);
        e.add(directivo);


        Cliente cliente1 = new Cliente("D", 21, "1111111");
        Cliente cliente2 = new Cliente("E", 22, "2222222");
        ArrayList<Cliente> c = new ArrayList<>();
        c.add(cliente1);
        c.add(cliente2);

        Empresa empresa = new Empresa("Empresa SA", e, c);

        empresa.mostrar();

    }


}
