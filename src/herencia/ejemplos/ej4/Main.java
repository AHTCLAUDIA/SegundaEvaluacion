package herencia.ejemplos.ej4;

public class Main {
    public static void main(String[] args) {
        AnimalMitológico am = new AnimalMitológico();
        am.hola();
        AnimalMitológico q = new Quimera();
        q.hola();
        AnimalMitológico d = new Dragón();
        d.hola();
        ((Dragón) d).pintarAlas();
    }
}
