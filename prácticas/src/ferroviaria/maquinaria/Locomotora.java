package ferroviaria.maquinaria;

import ferroviaria.personal.Mecánico;

public class Locomotora {
    String matrícula;
    int potencia;
    int añoFabricación;
    Mecánico mecánico;
    public static int locomotoras;

    // Constructor parametrizado
    public Locomotora(String matrícula, int potencia, int añoFabricación, Mecánico mecánico) {
        this.matrícula = matrícula;
        this.potencia = potencia;
        this.añoFabricación = añoFabricación;
        this.mecánico = mecánico;
        locomotoras++;
    }

    // Getters y setters

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAñoFabricación() {
        return añoFabricación;
    }

    public void setAñoFabricación(int añoFabricación) {
        this.añoFabricación = añoFabricación;
    }

    public Mecánico getMecánico() {
        return mecánico;
    }

    public void setMecánico(Mecánico mecánico) {
        this.mecánico = mecánico;
    }

    @Override
    public String toString() {
        return "\nLocomotora{" +
                "matrícula='" + matrícula + '\'' +
                ", potencia=" + potencia +
                ", añoFabricación=" + añoFabricación +
                ", mecánico=" + mecánico.toString() +
                '}';
    }

    public void imprimirDatos() {
        System.out.println("\nDatos de locomotora:\uD83D\uDE82" );
        System.out.println("=====================");
        System.out.println(toString());
    }
}

