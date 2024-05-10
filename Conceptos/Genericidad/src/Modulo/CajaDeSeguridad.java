package Modulo;

import Interfaces.IValorable;

public class CajaDeSeguridad<T extends Botella & IValorable> extends Contenedor<T>{

    //Atributos
    private int clave;
    private String marca;


    // Construcotr
    public CajaDeSeguridad(int clave, String marca) {
        this.clave = clave;
        this.marca = marca;
    }

    //Getters y Setters
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "CajaDeSeguridad{" +
                "clave=" + clave +
                ", marca='" + marca + '\'' +
                "} " + super.toString();
    }


}
