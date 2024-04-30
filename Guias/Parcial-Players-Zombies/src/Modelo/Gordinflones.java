package Modelo;

import Interfaces.ICamuflar;
import Interfaces.IZombie;

public class Gordinflones extends Personaje implements IZombie, ICamuflar {
    private int gordinflonidad; //Que tan gordinfon es


    public Gordinflones(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma, int gordinflonidad) {
        super(posicionX, posicionY, nombre, skin, nivelDeVida, arma);
        this.gordinflonidad = gordinflonidad;
    }


    public int getGordinflonidad() {
        return gordinflonidad;
    }

    private void setGordinflonidad(int gordinflonidad) {
        this.gordinflonidad = gordinflonidad;
    }


    //Metodos

    @Override
    public String camuflarse() {


        return "Camuflaje activado";
    }

    @Override
    public String morder() {
        return "Mordida moribida";
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Gordinflones{" +
                "gordinflonidad=" + gordinflonidad +
                '}';
    }

    @Override
    public String atacar() {
        return morder();
    }

    @Override
    public String defender() {
        return "Aplastada";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Colesterol alto";
    }

    @Override
    public String cargarEnergia() {
        return "Energia el 60%";
    }
}
