package modulo;

import java.util.Date;

public class Boleto {

    // Atributos
    private double precio;
    private int nroBoleto;
    private Date fecha;

    // Constructores


    public Boleto(){
        this.precio = 0;
        this.nroBoleto = 0;
        this.fecha = new Date();
    }
    public Boleto(double precio, int nroBoleto) {
        this.precio = precio;
        this.nroBoleto = nroBoleto;
        this.fecha = new Date();
    }

    // Getters Y Setters


    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNroBoleto() {
        return nroBoleto;
    }

    private void setPrecio(int precio) {
        this.precio = precio;
    }

    private void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    // Metodos

    public String mostrarBoleto(){
        return "---Boleto---\nn° " + getNroBoleto() + "\nPrecio: " + getPrecio() + "\nFecha: " + getFecha();
    }

}
