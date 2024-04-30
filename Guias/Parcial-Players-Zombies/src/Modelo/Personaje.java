package Modelo;

import Interfaces.IComportamientosAdicionales;

public abstract class Personaje extends Juego implements IComportamientosAdicionales {

    //Atributos
    private String nombre;
    private String skin;
    private int nivelDeVida;
    private String arma;

    //Constructores


    public Personaje(int posicionX, int posicionY, String nombre, String skin, int nivelDeVida, String arma) {
        super(posicionX, posicionY);
        this.nombre = nombre;
        this.skin = skin;
        this.nivelDeVida = nivelDeVida;
        this.arma = arma;
    }


    public Personaje(){
        super();
        this.nombre = "sin nombre";
        this.nivelDeVida = 0;
        this.arma = "sin arma";
        this.skin = "sin skin";
    }

    //Getters y setters


    public String getNombre() {
        return nombre;
    }

    public String getSkin() {
        return skin;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public String getArma() {
        return arma;
    }

    protected void setNivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    protected void setArma(String arma) {
        this.arma = arma;
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() +  "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", skin='" + skin + '\'' +
                ", nivelDeVida=" + nivelDeVida +
                ", arma='" + arma + '\'' +
                '}';
    }


}
