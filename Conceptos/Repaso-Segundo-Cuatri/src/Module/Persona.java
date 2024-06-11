package Module;

import ENUM.ESexo;
import JsonUtiles.JsonUtiles;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private ESexo genero;

    public Persona(String nombre, int edad, ESexo genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ESexo getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }





}
