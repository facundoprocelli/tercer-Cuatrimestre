package Modelo;

import Interfaces.IOtrosVuelos;

public class Carguero extends Avion implements IOtrosVuelos {
    private double capacidadDeCarga;
    private  String productosTransportables;

    //Cosntrucotor

    public Carguero(String nombre, String marca, double capacidadDeCombustible, String tipoDeMotor, int cantidadDeAsientos, double capacidadDeCarga, String productosTransportables, String patente) {
        super(nombre, marca, capacidadDeCombustible, tipoDeMotor, cantidadDeAsientos, patente);
        this.capacidadDeCarga = capacidadDeCarga;
        this.productosTransportables = productosTransportables;
    }


    //Getters y Setters


    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public String getProductosTransportables() {
        return productosTransportables;
    }

    //Metodos

    @Override
    public String despegar() {
        return "Carreteando.. Fuuuuuuuuuuuuuuuuuuuuuuuuuuum";
    }

    @Override
    public String aterrizar() {
        return "Aseguren que esta todo ajustado";
    }

    @Override
    public String volar() {
        return "Estamos volando a 15000 pies";
    }

    @Override
    public boolean ingresar() {
        boolean rta = false;
         double op = Math.floor(Math.random() * (1));
         if(op == 1){
             rta = true;
         }
         return rta;
    }

    @Override
    public String toString() {
        return super.toString() +  "Carguero{" +
                "capacidadDeCarga=" + capacidadDeCarga +
                ", productosTransportables='" + productosTransportables + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean rta= false;

        if(obj != null){
            if(obj instanceof Carguero){
                Carguero aComparar = (Carguero) obj;
                if(getPatente().equals(aComparar.getPatente())){
                    rta = true;
                }

            }
        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
