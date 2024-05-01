package Modulo;

import Interfaces.Ivalorar;

public abstract class Animal implements Ivalorar {

    //Atributos
    private String especie;
    private String nombre;
    private int edad;
    private String estadoDeSalud;
    private int valoracion;

    //Cnstrucotres


    public Animal(String especie, String nombre, int edad, String estadoDeSalud) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoDeSalud = estadoDeSalud;
        this.valoracion = -1;
    }

    public Animal(){
        this.especie = "Sin especie";
        this.nombre = "Sin nombre";
        this.edad = -1;
        this.estadoDeSalud = "Sin estado de salud";
        this.valoracion = -1;
    }

    //Getters y Setters


    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public int getValoracion() {
        return valoracion;
    }

    protected void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
    // Metodos


    //Sobreescrituras


    @Override
    public String toString() {
        return "\n" + "Animal{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }
}
