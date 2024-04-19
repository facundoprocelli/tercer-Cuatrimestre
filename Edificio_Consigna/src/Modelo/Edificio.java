package Modelo;

public abstract class Edificio {

    // Atributos
    double superficie;

    //Constructor
    public Edificio(double superficie){
        this.superficie = superficie;
    }

    //Getters Y Setters


    public double getSuperficie() {
        return superficie;
    }

    public String mostrarDatos(){
        return "El edificio tiene una superfice de " + getSuperficie();
    }

}
