package Modulo;

public class Botellas {

    private double capacidad;
    private String tipoDeCierre;

    public Botellas(double capacidad, String tipoDeCierre) {
        this.capacidad = capacidad;
        this.tipoDeCierre = tipoDeCierre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoDeCierre() {
        return tipoDeCierre;
    }

    public void setTipoDeCierre(String tipoDeCierre) {
        this.tipoDeCierre = tipoDeCierre;
    }
}
