package Modelo;

import Interfaces.IZombie;

public class Corredores extends Personaje implements IZombie {

    //Atributo
    private int velocidad;

    //Construcotr

    public Corredores(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma, int velocidad) {
        super(posicionX, posicionY, nombre, skin, nivelDeVida, arma);
        this.velocidad = velocidad;
    }


    //Getters y Setters

    public int getVelocidad() {
        return velocidad;
    }

    private void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Metodos
    @Override
    public String morder() {
        return null;
    }

    public String correr(){
        return "Esta corriendo";
    }


    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Corredores{" +
                "velocidad=" + velocidad +
                '}';
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defender() {
        return "Corre perra corre";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "A punta de espada" ;
    }

    @Override
    public String cargarEnergia() {

        return "Energia recargada al 40%";
    }
}
