package Modelo;

import Interfaces.IOtrosVuelos;

public class Militar extends Avion implements IOtrosVuelos {

    private String sistemaDeArmas;
    private int cantidadDeMuniciones;

    //Construcotr


    public Militar(String nombre, String marca, double capacidadDeCombustible, String tipoDeMotor, int cantidadDeAsientos, String patente, String sistemaDeArmas, int cantidadDeMuniciones) {
        super(nombre, marca, capacidadDeCombustible, tipoDeMotor, 0, patente);
        this.sistemaDeArmas = sistemaDeArmas;
        this.cantidadDeMuniciones = cantidadDeMuniciones;
    }

    //Getters y Setters

    public String getSistemaDeArmas() {
        return sistemaDeArmas;
    }

    public int getCantidadDeMuniciones() {
        return cantidadDeMuniciones;
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
        return super.toString() +"Militar{" +
                "sistemaDeArmas='" + sistemaDeArmas + '\'' +
                ", cantidadDeMuniciones=" + cantidadDeMuniciones +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta= false;

        if(obj != null){
            if(obj instanceof Militar){
                Militar aComparar = (Militar) obj;
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




