package Modelo;

import Interfaces.IPlayer;

public class Ellie extends Personaje implements IPlayer {


    //Atributos
    private int gradoDeHumor;
    private int cantidadChistesMalos;

    //Construcotres
    public Ellie(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma, int gradoDeHumor, int cantidadChistesMalos) {
        super(posicionX, posicionY, nombre, skin, nivelDeVida, arma);
        this.gradoDeHumor = gradoDeHumor;
        this.cantidadChistesMalos = cantidadChistesMalos;
    }

    public Ellie(){
        super();
        this.cantidadChistesMalos = 0;
        this.gradoDeHumor = 0;
    }

    //Getters Y Setters


    public int getGradoDeHumor() {
        return gradoDeHumor;
    }

    public int getCantidadChistesMalos() {
        return cantidadChistesMalos;
    }

    private void setGradoDeHumor(int gradoDeHumor) {
        this.gradoDeHumor = gradoDeHumor;
    }

    private  void setCantidadChistesMalos(int cantidadChistesMalos) {
        this.cantidadChistesMalos = cantidadChistesMalos;
    }
    //Metodos

    @Override
    public String curarse() {
        setNivelDeVida(100);
        return "Vida curada al 100%";
    }

    @Override
    public String recargar() {
        return "Arma recargada";
    }




//Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Ellie{" +
                "gradoDeHumor=" + gradoDeHumor +
                ", cantidadChistesMalos=" + cantidadChistesMalos +
                '}';
    }

    @Override
    public String atacar() {
        return "Headshot";
    }

    @Override
    public String defender() {
        return "Voltereta triple";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "fue moridad";
    }

    @Override
    public String cargarEnergia() {
        return "tun tun tun tun, energia al 100%";
    }
}
