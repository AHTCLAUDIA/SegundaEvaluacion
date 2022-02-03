package herencia.ejemplos.ej4;

public class Dragón extends AnimalMitológico{
    String alas;

    public Dragón() {
        super.emoji = "\uD83D\uDC32";
        //System.out.println(this.emoji);
        this.alas = "s";
    }

    @Override
    public void hola() {
        //super.hola();
        System.out.println("ggggrrrrr.....");
    }

    public void pintarAlas() {
        System.out.println(this.alas);
    }
}
