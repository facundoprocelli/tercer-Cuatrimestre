package Modelo;

import java.io.Serializable;
import java.util.Objects;

public class Automovil implements Serializable {

    private String marca;
    private String modelo;
    private Especificaciones especificaciones;

    public Automovil(String marca, String modelo, Especificaciones especificaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.especificaciones = especificaciones;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", especificaciones=" + especificaciones +
                '}';
    }
}
