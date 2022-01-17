package poo.ejercicios.ejercicio16.banco;

public class Cuenta {
    private String código;
    private float balance;
    private Usuario propietario; // este atributo es un objeto de tipo Usuario

    public Cuenta(String código, float balance, Usuario propietario) {
        this.código = código;
        this.balance = balance;
        this.propietario = propietario;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }
}
