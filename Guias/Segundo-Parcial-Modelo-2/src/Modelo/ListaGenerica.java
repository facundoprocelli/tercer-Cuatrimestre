package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaGenerica<E> implements Serializable {

    private ArrayList<E> lista;

    public ListaGenerica() {
        this.lista = new ArrayList<>();
    }

    public void agregar(E e){
        this.lista.add(e);
    }

    public boolean eliminar(E e){
        return  this.lista.remove(e);
    }

    public int contar(){
        return this.lista.size();
    }

    public E buscarXPos(int pos){
        return this.lista.get(pos);
    }


    @Override
    public String toString() {
        return "ListaGenerica{" +
                "lista=" + lista +
                '}';
    }
}
