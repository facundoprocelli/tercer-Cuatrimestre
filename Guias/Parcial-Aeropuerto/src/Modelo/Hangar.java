package Modelo;

import java.util.HashSet;
import java.util.Iterator;

public class Hangar {

    //Atributos
    private HashSet<Avion> avionHashSet;
    private int cantidadDeAviones;
    private int numeroDeHangar;

    //Construcotr


    public Hangar(int numeroDeHangar) {
        this.avionHashSet = new HashSet<Avion>();
        this.cantidadDeAviones = 0;
        this.numeroDeHangar = numeroDeHangar;
    }

    //Getters y setters

    public HashSet<Avion> getAvionHashSet() {
        return avionHashSet;
    }

    public int getCantidadDeAviones() {
        return cantidadDeAviones;
    }

    public int getNumeroDeHangar() {
        return numeroDeHangar;
    }

    public void setCantidadDeAviones(int cantidadDeAviones) {
        this.cantidadDeAviones = cantidadDeAviones;
    }

    //Metodos

    public void agregarAvionAlHangar(Avion avion){
        this.cantidadDeAviones++;
        this.avionHashSet.add(avion);
    }

    public String despegarTodos(){

        Iterator<Avion>iterator = avionHashSet.iterator();
        String rta = "";
        while(iterator.hasNext()){

            Avion avion = iterator.next();
            rta += avion.despegar();
        }

        return rta;
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return "\n" + "Hangar{" +
                ", cantidadDeAviones=" + cantidadDeAviones +
                ", numeroDeHangar=" + numeroDeHangar +
                " avionHashSet=" + avionHashSet + "\n" +

                '}' + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;

        if(obj != null){
            if(obj instanceof  Hangar){
                Hangar aComaprar = (Hangar) obj;

                if(getNumeroDeHangar() == aComaprar.getNumeroDeHangar()){
                    rta = true;
                }
            }
        }

        return rta;
    }
}
