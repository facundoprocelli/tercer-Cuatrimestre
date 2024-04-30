package Modelo;

import Interfaces.IZombie;

public class Chasqueadores extends Personaje implements IZombie {

    private int potenciaDeChasqueo;

    public Chasqueadores(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma, int potenciaDeChasqueo) {
        super(posicionX, posicionY, nombre, skin, nivelDeVida, arma);
        this.potenciaDeChasqueo = potenciaDeChasqueo;
    }

    public Chasqueadores(){
        super();
        this.potenciaDeChasqueo = 0;
    }


    public int getPotenciaDeChasqueo() {
        return potenciaDeChasqueo;
    }

    public void setPotenciaDeChasqueo(int potenciaDeChasqueo) {
        this.potenciaDeChasqueo = potenciaDeChasqueo;
    }

    @Override
    public String morder() {
        return "Te he mordido chak chak";
    }

    public String chasquear(){
        return "chak chak chak";
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Chasqueadores{" +
                "potenciaDeChasqueo=" + potenciaDeChasqueo +
                '}';
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defender() {
        return "Chasquido sonico";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Espadazo en la nuca";
    }

    @Override
    public String cargarEnergia() {
        return "Energia recargada el 8%";
    }
}
