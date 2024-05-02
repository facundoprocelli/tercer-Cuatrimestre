package Modulo;

public abstract class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;
    private String tipoDeCombustible;
    private String patente;
    private boolean disponible;

    //Construcotr


    public Vehiculo(String marca, String modelo, String tipoDeCombustible, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoDeCombustible = tipoDeCombustible;
        this.patente = patente;
        this.disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public boolean isDisponibilidad() {
        return disponible;
    }

    public void setDisponible(boolean disponibilidad) {
        this.disponible = disponibilidad;
    }

    //Metodos
    public abstract double calcularTarifa(double distancia);

    //Sobreescrituras


    @Override
    public String toString() {
        return "\n" +"Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoDeCombustible='" + tipoDeCombustible + '\'' +
                ", patente='" + patente + '\'' +
                ", disponible=" + disponible +
                '}' ;
    }


}
