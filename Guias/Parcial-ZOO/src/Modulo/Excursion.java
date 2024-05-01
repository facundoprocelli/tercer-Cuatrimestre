package Modulo;

import Interfaces.Ivalorar;

public class Excursion implements Ivalorar {

    //Atributos
    private String diaDeExcursion;
    private int valoracion;

    //Constructores


    public Excursion(String diaDeExcursion, int valoracion) {
        this.diaDeExcursion = diaDeExcursion;
        this.valoracion = valoracion;
    }

    public Excursion(){
        this.diaDeExcursion= "Sin dia asignado";
        this.valoracion = 50;
    }

    //Getters y Setters


    public String getDiaDeExcursion() {
        return diaDeExcursion;
    }

    public int getValoracion() {
        return valoracion;
    }

    private void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public int calcularValoracion() {

        if(getDiaDeExcursion().equals("Sabado") || getDiaDeExcursion().equals("Domingo")){
            setValoracion (getValoracion() * 2);
        }
        return valoracion;

    }
}
