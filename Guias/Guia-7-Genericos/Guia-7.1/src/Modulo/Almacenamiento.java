package Modulo;

import java.util.ArrayList;

public class Almacenamiento <E> {

    private ArrayList<E> almacenamiento;

    public Almacenamiento() {
        this.almacenamiento = new ArrayList<E>();
    }


    public void agregar(E dato){
        almacenamiento.add(dato);
    }

    public void eliminar(E dato){
        almacenamiento.remove(dato);
    }


    public boolean buscar(E dato){
       return almacenamiento.contains(dato);
    }

}
