package Modulo;

import java.util.LinkedList;

public class Pila<E> {

    private LinkedList<E> pila;

    public Pila() {
        this.pila = new LinkedList<>();
    }

    public void agregar(E dato){
        pila.addFirst(dato);
    }

    public void eliminar(){
        pila.removeFirst();
    }

    public boolean buscar (E dato){
        return pila.contains(dato);
    }

    public int contar(){
        return pila.size();
    }
}
