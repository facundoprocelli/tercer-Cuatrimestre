package Modelo;

public class Muro extends Objeto{

    //Atributos
    private int resistencia;

    //Constructores

    public Muro(int posicionX, int posicionY, double ancho, double alto, int resistencia) {
        super(posicionX, posicionY, ancho, alto);
        this.resistencia = resistencia;
    }

    public Muro(){
        this.resistencia = 0;
    }


    //Getters y setters

    public int getResistencia() {
        return resistencia;
    }


    //MEtodos

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Muro{" +
                "resistencia=" + resistencia +
                '}';
    }
}
