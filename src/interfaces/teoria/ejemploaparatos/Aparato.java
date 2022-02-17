package interfaces.teoria.ejemploaparatos;

public abstract class Aparato implements Funcionalidad{
    // aunque implementamos la interfaz, no me obliga a desarrollar
    // los métodos abstractos de la interfaz
    // porque esta clase también es abstracta

    protected String serialNumber;
    protected boolean on;
    public Aparato(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    protected void encender(boolean on) {
        this.on = on;
    }
}
