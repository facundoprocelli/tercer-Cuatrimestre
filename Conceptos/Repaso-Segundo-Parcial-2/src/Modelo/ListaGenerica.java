package Modelo;

import java.util.ArrayList;

public class ListaGenerica<E> {

    private ArrayList<E> lista;

    public ListaGenerica() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<E> getLista() {
        return lista;
    }

    public void agregar(E dato){
        lista.add(dato);
    }

    public void eliminar(E dato){
        lista.remove(dato);
    }

    public E buscarXindice(int i){
        return lista.get(i);
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
