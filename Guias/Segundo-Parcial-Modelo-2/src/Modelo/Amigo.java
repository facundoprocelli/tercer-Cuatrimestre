package Modelo;

import java.io.Serializable;

public class Amigo implements Serializable {
    private int id;
    private String nombre;

    public Amigo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object obj) {
        boolean rta = false;

        if (obj instanceof Amigo amigo) {

            if (this.getNombre().equals(amigo.getNombre())) {
                rta = true;
            }
        }

        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
