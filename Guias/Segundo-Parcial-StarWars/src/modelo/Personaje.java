package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Personaje implements Serializable {
    private String nombre;
    private int edad;
    private boolean jedi;
    private String planeta_nacimiento;
    private Maestro maestro;
    private ArrayList<Amigo> amigos;
    private ArrayList<Evento> eventos;

    public Personaje(String nombre, int edad, boolean jedi, String planeta_nacimiento, Maestro maestro, ArrayList<Amigo> amigos, ArrayList<Evento> eventos) {
        this.nombre = nombre;
        this.edad = edad;
        this.jedi = jedi;
        this.planeta_nacimiento = planeta_nacimiento;
        this.maestro = maestro;
        this.amigos = amigos;
        this.eventos = eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isJedi() {
        return jedi;
    }

    public String getPlaneta_nacimiento() {
        return planeta_nacimiento;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", jedi=" + jedi +
                ", planeta_nacimiento='" + planeta_nacimiento + '\'' +
                ", maestro=" + maestro +
                ", amigos=" + amigos +
                ", eventos=" + eventos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean rta = false;

        if(o instanceof  Personaje p){
            if(this.getNombre().equals(p.getNombre())){
                rta = true;
            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
