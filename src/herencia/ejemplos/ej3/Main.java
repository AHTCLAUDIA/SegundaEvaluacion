package herencia.ejemplos.ej3;

public class Main {
    public static void main(String[] args) {
        Mamífero m = new Mamífero();
        System.out.println(m.saludar());

        Gato g = new Gato();
        System.out.println(g.saludar());
        System.out.println(g.saludar(5));

        Humano h = new Humano();
        System.out.println(h.saludar());
    }
}
