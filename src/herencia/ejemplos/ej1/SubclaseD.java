package herencia.ejemplos.ej1;

public class SubclaseD extends SubclaseA{

    public void verAtributosDeSuperclase() {
        System.out.println(protectedSuperClase); // ok porque es clase hija
        System.out.println(publicSuperclase); // ok porque public se ve desde todas partes
        System.out.println(defaultSuperclase); // ok porque está en el mismo paquete
        //System.out.println(privateSuperclase); // no on porque es privado
    }


}
