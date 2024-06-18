package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Maestro implements Serializable {
    private String nombre;
    private boolean es_jedi;
    private ArrayList<String> habilidades;

    public Maestro(String nombre, boolean es_jedi, ArrayList<String> habilidades) {
        this.nombre = nombre;
        this.es_jedi = es_jedi;
        this.habilidades = habilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEs_jedi() {
        return es_jedi;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    @Override
    public String toString() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", es_jedi=" + es_jedi +
                ", habilidades=" + habilidades +
                '}';
    }


}
