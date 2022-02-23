package ferroviaria.maquinaria;

class Vagon {
    // el atributo id es estático, y se incrementa automáticamente cada vez
    // que creamos un vagón
    int id;
    int cargaMax;
    int cargaActual;
    TipoMercancía mercancía;

    // constructor parametrizado
    public Vagon(int id, int cargaMax, int cargaActual, TipoMercancía mercancía) {
        this.id = id;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancía = mercancía;
        id++;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public TipoMercancía getMercancía() {
        return mercancía;
    }

    public void setMercancía(TipoMercancía mercancía) {
        this.mercancía = mercancía;
    }

    // Imprimir datos vagón


    @Override
    public String toString() {
        return "Vagon{" +
                "id=" + id +
                ", cargaMax=" + cargaMax +
                ", cargaActual=" + cargaActual +
                ", mercancía=" + mercancía +
                '}';
    }

    public void imprimirDatos() {
        System.out.println(this.toString());
    }
}
