package Modelo;

import java.io.Serializable;

public class Especificaciones implements Serializable {

    private int velocidadMaxima;
    private double caballosDeFuerza;
    private double peso;
    private double consumo; //Cuanto consume cada 100 kilometros

    public Especificaciones(int velocidadMaxima, double caballosDeFuerza, double peso, double consumo) {
        this.velocidadMaxima = velocidadMaxima;
        this.caballosDeFuerza = caballosDeFuerza;
        this.peso = peso;
        this.consumo = consumo;
    }

    public double getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }


    @Override
    public String toString() {
        return "Especificaciones{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", caballosDeFuerza=" + caballosDeFuerza +
                ", peso=" + peso +
                ", consumo=" + consumo +
                '}';
    }
}
