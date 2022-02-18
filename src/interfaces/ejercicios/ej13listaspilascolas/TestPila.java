package interfaces.ejercicios.ej13listaspilascolas;

public class TestPila {
    public static void main(String[] args) {
        System.out.println("Creamos una pila");
        Pila p = new Pila();
        p.mostrar();
        System.out.println("Apilamos 5 números");
        for (int i = 0; i < 5; i++) {
            int número = (int) (Math.random() * 100);
            p.apilar(número);
        }
        p.mostrar();
        System.out.println("Probamos el método desapilar");
        for (int i = 0; i < 5; i++) {
            System.out.println("Desapilando: " + p.desapilar());
            p.mostrar();
        }

    }
}
