package Modulo;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaGenerica <E> implements Serializable {

    private ArrayList<E> list;

    public ListaGenerica() {
        this.list = new ArrayList<>();
    }

    public void agregar(E e){
        list.add(e);
    }

    public boolean eliminar(E e){
        return  list.remove(e);
    }

    public int contar(){
        return list.size();
    }

    public E buscarXPos(int pos){
        return list.get(pos);
    }


    @Override
    public String toString() {
        return "ListaGenerica{" +
                "list=" + list +
                '}';
    }
}
