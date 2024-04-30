package Modelo;

import Interfaces.IZombie;

public class Acechadores extends  Personaje implements IZombie {

    //Atributos

    private String Vision;

    // Construcotr

    public Acechadores(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma, String vision) {
        super(posicionX, posicionY, nombre, skin, nivelDeVida, arma);
        Vision = vision;
    }


    //Getters y Setters


    public String getVision() {
        return Vision;
    }

    public void setVision(String vision) {
        Vision = vision;
    }



    //Metodos
    @Override
    public String morder() {
        return "Mordido con la vista";
    }

    public String acechar(){
        return "Te esa acenchando";
    }


    //Reescrituras


    @Override
    public String toString() {
        return super.toString() + "Acechadores{" +
                "Vision='" + Vision + '\'' +
                '}';
    }

    @Override
    public String atacar() {
        return  morder();
    }

    @Override
    public String defender() {
        return "Tijeretazo";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Disparo en la cabeza";
    }

    @Override
    public String cargarEnergia() {
        return "energia el 10%";
    }
}
