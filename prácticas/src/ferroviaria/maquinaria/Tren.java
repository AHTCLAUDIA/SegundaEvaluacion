package ferroviaria.maquinaria;

import ferroviaria.personal.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;

public class Tren {
    Locomotora locomotora;
    ArrayList<Vagon> vagones = new ArrayList(5);
    Maquinista maquinista;
    public static int trenes;

    // Getters y setters

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public int getVagones() {
        return vagones.size();
    }

    public void setVagones(ArrayList<Vagon> vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    // el tren se crea inicialmente solamente con una locomotora, sin vagones ni maquinista
    public Tren(Locomotora locomotora) {
        this.locomotora = locomotora;
        trenes++;
    }
    // Método para imprimir datos del tren

    @Override
    public String toString() {
        return "\nTren:" +
                "\nlocomotora=" + locomotora +
                ", \nvagones=" + vagones +
                ", \nmaquinista=" + maquinista +
                '}';
    }

    public void imprimirDatos() {
        System.out.println("\nDatos del tren: \uD83D\uDE85");
        System.out.print("\uD83D\uDE82");
        for (int i = 0; i < vagones.size(); i++) {
            System.out.print("-\uD83D\uDE83");
        }
        System.out.println(this.toString());

    }

    // la clase tren contiene un método público para añadir vagones al tren
    // que comprueba el número de vagones que contiene, y si no supera a 5, crea un vagón
    // con los datos que le proporcionemos por teclado y lo añade al tren
    public void añadirVagón() {
        if (vagones.size() >= 5) {
            System.out.println("No se puede añadir más vagones al tren.");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Creando vagón...");

            System.out.println("¿Cuál es la carga máxima?");
            int cargaMax = sc.nextInt();
            int mercancía;
            do {
                System.out.println("¿Qué tipo de mercancía lleva?\n1. Perecedera\n2. No perecedera\n3. Frágil\n4. Peligrosa\n5. Dimensional");
                mercancía = sc.nextInt();
                sc.nextLine();
                if(mercancía < 1 || mercancía > 5) {
                    System.out.println("Valor incorrecto");
                }
            } while (mercancía < 1 || mercancía > 5);
            // eso se podría sacar a un método fuera, pero lo dejamos aquí
            TipoMercancía tipo = null;
            switch (mercancía) {
                case 1 -> tipo = TipoMercancía.PERECEDERA;
                case 2 -> tipo = TipoMercancía.NO_PERECEDERA;
                case 3 -> tipo = TipoMercancía.FRÁGIL;
                case 4 -> tipo = TipoMercancía.PELIGROSA;
                case 5 -> tipo = TipoMercancía.DIMENSIONAL;
            }
            Vagon vagon = new Vagon(trenes+vagones.size()+1, cargaMax, 0, tipo);
            vagones.add(vagon);
        }
    }

    // la clase tren también contiene un método para eliminar vagones. Siempre eliminamos el último vagón que se haya añadido
    public void eliminarVagon() {
        vagones.remove(vagones.size() -1);
    }
}

