package modelo;

import java.io.Serializable;

public class Evento implements Serializable {

    private String nombre;
    private int anio;
    private boolean ganada;

    public Evento(String nombre, int anio, boolean ganada) {
        this.nombre = nombre;
        this.anio = anio;
        this.ganada = ganada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isGanada() {
        return ganada;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", anio=" + anio +
                ", ganada=" + ganada +
                '}';
    }
}
