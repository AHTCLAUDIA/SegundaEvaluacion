package poo.ejercicios.ejercicio20.aplicacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crea un usuario con datos que pedimos por teclado

        // Primero pedimos los datos para crear el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String u = sc.nextLine();
        System.out.println("Email:");
        String e = sc.nextLine();
        System.out.println("Password:");
        String p = sc.nextLine();

        // Ya tengo los datos, ahora creo el usuario
        // es decir, un objeto de tipo Usuario
        Usuario u1 = new Usuario(u, e, p);

        // Imprime los datos del usuario creado
        u1.imprimirDatos();

        // No nos lo piden, pero vamos a probar creando un nuevo usuario si aparece el estado
        Usuario u2 = new Usuario("Paula", "pau@gmail.com", "4321");
        u2.imprimirDatos();

        //Para probar este método mensajeEstado, ve al main y llama al método con el usuario creado.
        System.out.println("\nProbamos el método mensajeEstado()");
        u1.mensajeEstado();
        u2.mensajeEstado();

        // A continuación, cambia el estado del usuario a ACTIVO,
        System.out.println("Cambiamos el estado de los dos usuarios");
        u1.setEstado(Estado.ACTIVO);
        u2.setEstado(Estado.BLOQUEADO);

        // y vuelve a llamar al método mensajeEstado.
        u1.mensajeEstado();
        u2.mensajeEstado();

    }
}
