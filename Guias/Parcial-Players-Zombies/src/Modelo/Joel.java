package Modelo;

import Interfaces.IPlayer;

public class Joel extends  Personaje implements IPlayer {

    //Atributos

    private int cuanMalaonda;
    private int cuanTestarudo;

    //Construcotres


    public Joel(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma, int cuanMalaonda, int cuanTestarudo) {
        super(posicionX, posicionY, nombre, skin, nivelDeVida, arma);
        this.cuanMalaonda = cuanMalaonda;
        this.cuanTestarudo = cuanTestarudo;
    }

    public Joel(){
        super();
        this.cuanMalaonda = 0;
        this.cuanTestarudo = 0;
    }


    //Getters y Setters


    public int getCuanMalaonda() {
        return cuanMalaonda;
    }

    public int getCuanTestarudo() {
        return cuanTestarudo;
    }

    private void setCuanMalaonda(int cuanMalaonda) {
        this.cuanMalaonda = cuanMalaonda;
    }

    private void setCuanTestarudo(int cuanTestarudo) {
        this.cuanTestarudo = cuanTestarudo;
    }


    //Metodos

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Joel{" +
                "cuanMalaonda=" + cuanMalaonda +
                ", cuanTestarudo=" + cuanTestarudo +
                '}';
    }

    @Override
    public String curarse() {
        setNivelDeVida(85);
        return "Vida Recargada al 85%";
    }

    @Override
    public String recargar() {
        return "Arma recargada";
    }

    @Override
    public String atacar() {
        return "Espadazo triple";
    }

    @Override
    public String defender() {
        return "mortal para atras";
    }

    @Override
    public String morir() {
        setNivelDeVida(0);
        return "Ha sido atacado por un zombie";
    }

    @Override
    public String cargarEnergia() {
        return "tun tun tun tun Energia al 90%";
    }
}


