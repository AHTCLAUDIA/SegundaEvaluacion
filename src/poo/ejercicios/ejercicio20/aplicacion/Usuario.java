package poo.ejercicios.ejercicio20.aplicacion;

public class Usuario {
    // Atributos
    private String username;
    private String email;
    private String password;
    // Añade a la clase Usuario un atributo estado de tipo Estado;
    Estado estado;

    // Constructor parametrizado
    // Constructor con tres parámetros para inicializar las instancias de la clase
    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        // Haz lo necesario para que cuando se crea un usuario se le asigne por defecto el
        //estado pendiente.
        // esto significa que modifico el constructor para inicializar el estado pero sin tener que pedirlo
        this.estado = Estado.PENDIENTE;
    }

    /*
    Getters y setters para los atributos, teniendo en cuenta que una vez creado un
usuario no podemos cambiar su nombre
     */

    public String getUsername() {
        return username;
    }

    // vamos a dejar comentado este método porque no queremos que se pueda cambiar el nombre del usuario
    /*public void setUsername(String username) {
        this.username = username;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Añade métodos para poder ver y cambiar el estado de un usuario.

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    // *** NUEVO **** MÉTODO toString()


    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", estado=" + estado +
                '}';
    } // he borrado y vuelto a crear el toString() para incluir el estado

    // OJO: el método toString() no imprime, devuelve un String que será lo que yo imprima
    // en el método imprimirDatos() haremos una llamada a toString() y la imprimimos
    public void imprimirDatos() {
        System.out.println(this.toString());
    }


    // También en la clase Usuario crea un método mensajeEstado():void
    public void mensajeEstado() {
        switch (this.estado) {
            case PENDIENTE -> System.out.println("Tienes que esperar un poco");
            case ACTIVO -> System.out.println("Todo ok, vía libre");
            case BLOQUEADO -> System.out.println("Usuario bloqueado. Algo habrás hecho");
            default -> System.out.println("Estado desconocido");
        }
    }
}
