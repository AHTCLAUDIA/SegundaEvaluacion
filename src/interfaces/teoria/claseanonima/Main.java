package interfaces.teoria.claseanonima;

public class Main {
    public static void main(String[] args) {
        // vamos a crear un objeto de tipo Hablante
        // ¡¡¡ PERO NO PODEMOS, ES UNA INTERFAZ!!!
        // BUENO, SI LO QUE HACES ES UNA CLASE ANÓNIMA ENTONCES
        // SÍ QUE SE PUEDE
        Hablante hispanoHablante = new Hablante() {
            @Override
            public void decirHola() {
                System.out.println("Holi");
            }

            @Override
            public void decirAdios() {
                System.out.println("Chau");
            }
        };

        hispanoHablante.decirHola();
        hispanoHablante.decirAdios();


        Hablante loro = new Hablante() {
            @Override
            public void decirHola() {
                System.out.println("Rosita");
            }

            @Override
            public void decirAdios() {
                System.out.println("Rosita");
            }
        };
    }
}
