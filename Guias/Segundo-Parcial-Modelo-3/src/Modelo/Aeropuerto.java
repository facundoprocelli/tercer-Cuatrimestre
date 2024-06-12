package Modelo;

import java.io.Serializable;

public class Aeropuerto implements Serializable {

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private Tag tags;


    public Aeropuerto(String nombre, String ubicacion, int capacidad, Tag tags) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.tags = tags;

    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Tag getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", tags=" + tags +
                '}';
    }
}
