package Modelo;

import java.util.LinkedList;

public class ListaGenerica <E> {

    private LinkedList<E> lista;

    public ListaGenerica() {
        this.lista = new LinkedList<>();
    }

    public LinkedList<E> getLista() {
        return lista;
    }

    public void agregar (E e){
        lista.add(e);
    }

    public boolean eliminar(E e){
       return lista.remove(e);
    }

    public E buscarXPosicion(int pos){
        return lista.get(pos);
    }

    public int contar(){
        return lista.size();
    }
    @Override
    public String toString() {
        return "ListaGenerica{" +
                "lista=" + lista +
                '}';
    }
}
