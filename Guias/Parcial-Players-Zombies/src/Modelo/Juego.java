package Modelo;

public abstract class Juego {

    //Atributos
    private int posicionX;
    private int posicionY;

    //Constructores

    public Juego(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public Juego(){
        this.posicionX = 0;
        this.posicionY = 0;
    }



    //Getters y Setters

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    protected void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    protected void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    //Metodos

    //Sobreescrituras


    @Override
    public String toString() {
        return "Juego{" +
                "posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                '}' + "\n";
    }
}
