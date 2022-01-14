package poo.ejemplosTeoria;

import java.util.Date;

public class Clase {
    public static Date últimaCreada;
    public static int contadorDeObjetos; // es una variable de la clase, no de los objetos

    public Clase() {
        últimaCreada = new Date();
        contadorDeObjetos++; // contadorDeObjetos = contadorDeObjetos + 1
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println(Clase.contadorDeObjetos); // 0 objetos

        Clase c1 = new Clase();
        System.out.println(Clase.contadorDeObjetos); // 1 objeto

        Clase c2 = new Clase();
        System.out.println(Clase.contadorDeObjetos); // 2 objetos

    }
}
