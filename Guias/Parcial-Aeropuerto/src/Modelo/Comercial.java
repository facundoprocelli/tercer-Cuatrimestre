package Modelo;

import Interfaces.IServiciosExtra;

public class Comercial extends Avion implements IServiciosExtra {


    //Atributos
    private int cantidadDeAzafatas;
    private String servicios;

    //Constructor


    public Comercial(String nombre, String marca, double capacidadDeCombustible, String tipoDeMotor, int cantidadDeAsientos,String patente, int cantidadDeAzafatas, String servicios) {
        super(nombre, marca, capacidadDeCombustible, tipoDeMotor, cantidadDeAsientos, patente);
        this.cantidadDeAzafatas = cantidadDeAzafatas;
        this.servicios = servicios;
    }

    //Getters y Setters

    public int getCantidadDeAzafatas() {
        return cantidadDeAzafatas;
    }

    public String getServicios() {
        return servicios;
    }

    //Metodos


    @Override
    public String despegar() {
        return "Carreteando.. Fiiiiuuuuuuuummmmmmpsshh";
    }

    @Override
    public String aterrizar() {
        return "Abrochen sus cinturanos vamos a descender";
    }

    @Override
    public String volar() {
        return "Estamos volando a 10000 pies";
    }

    @Override
    public String servicioDeComida() {
        return "Pasta o Pollo?";
    }

    @Override
    public String darManta() {
        return "Aqui tiene su manta";
    }

    @Override
    public String toString() {
        return super.toString() + "Comercial{" +
                "cantidadDeAzafatas=" + cantidadDeAzafatas +
                ", servicios='" + servicios + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean rta= false;

        if(obj != null){
            if(obj instanceof Comercial){
                Comercial aComparar = (Comercial) obj;
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
