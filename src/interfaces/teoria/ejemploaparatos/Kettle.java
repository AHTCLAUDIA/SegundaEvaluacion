package interfaces.teoria.ejemploaparatos;

public class Kettle extends Aparato{
    protected double capacidad;

    public Kettle(String serialNumber, double capacidad) {
        super(serialNumber);
        this.capacidad = capacidad;
    }


    @Override
    public void on() {
        encender(true);
    }

    @Override
    public void off() {
        encender(false);
    }
}
