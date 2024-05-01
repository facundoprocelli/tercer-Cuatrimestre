package Modulo;

import java.util.Objects;

public class Ave extends  Animal{

    //Atributos
    private String plumaje;
    private boolean migratoria;

    //Construcotres
    public Ave(String especie, String nombre, int edad, String estadoDeSalud, String plumaje, boolean migratoria) {
        super(especie, nombre, edad, estadoDeSalud);
        this.plumaje = plumaje;
        this.migratoria = migratoria;
    }

    public Ave(){
        super();
        this.plumaje  = "Sin plumaje";
        this.migratoria = false;
        }
    //Getters y Setters


    public boolean isMigratoria() {
        return migratoria;
    }

    public String getPlumaje() {
        return plumaje;
    }

    //Metodos


    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Ave{" +
                "plumaje='" + plumaje + '\'' +
                ", migratoria=" + migratoria +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        boolean rta = false;
        if(object != null){
            if(object instanceof Ave){
                Ave aComparar = (Ave)object;

                if(getNombre().equals(aComparar.getNombre())){
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

    @Override
    public int calcularValoracion() {
        int valoracion = 10;

        if (getEstadoDeSalud().equals("malo")) {

            valoracion = valoracion / 2;
        }else if(getEstadoDeSalud().equals("estupendo")) {
            valoracion = valoracion * 2;
        }
setValoracion(valoracion);
        return valoracion;
    }
}







