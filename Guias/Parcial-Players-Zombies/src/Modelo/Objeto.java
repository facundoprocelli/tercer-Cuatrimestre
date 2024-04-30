package Modelo;

public abstract class Objeto extends Juego{

    //Atributos
    private double ancho;
    private double alto;

    //Construcotr

    public Objeto(int posicionX, int posicionY, double ancho, double alto) {
        super(posicionX, posicionY);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Objeto(){
        super();
        this.ancho = 0;
        this.alto = 0;
    }


    //Getters y Setters

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    // Metodos

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Objeto{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
