package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Piloto  implements Serializable {

    private String nombre;
    private String apellido;
    private int id;
    private int experiencia;
    private Tag tags;

    public Piloto(String nombre, String apellido, int id, int experiencia, Tag tags) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.experiencia = experiencia;
        this.tags = tags;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public Tag getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", experiencia=" + experiencia +
                ", tags=" + tags +
                '}';
    }
}
