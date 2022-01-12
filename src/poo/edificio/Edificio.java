package poo.edificio;

public class Edificio {
    /*
    La clase edificiio define un edificio en abstracto y la utilizaremos para construir después
edificios concretos como objetos.*/
//- Número de plantas (un número entero);
    int numPlantas;
//- Área (número decimal, metros cuadrados);
    double area;
//- Año de construcción (número entero).
    int año;


    public Edificio(int numPlantas, double area, int año){
        this.numPlantas = numPlantas;
        this.area = area;
        this.año = año;
    }

    public void imprimeDatos() {
        System.out.println("Edificio:" + this.numPlantas + " plantas, " + this.area + " m2; año de construcción : " + this.año);
    }
}


