package Modulo;

import Interfaces.IColeccionInterfaz;

import java.util.ArrayList;

public class Pila implements IColeccionInterfaz {

    //Atributos
    private ArrayList<Integer> Pila;
    private int contador;

    //Construcotor

    public Pila() {
        Pila = new ArrayList<>();
        this.contador = 0;
    }

    @Override
    public boolean estaVacia() {
        return Pila.isEmpty();
    }

    @Override
    public int extraer() {
        contador--;
        return Pila.removeLast();
    }

    @Override
    public int primero() {
        return Pila.getLast();
    }

    @Override
    public boolean agregarElemento(int num) {

        boolean rta = false;

        Pila.add(num);
        if(Pila.contains(num)){
            rta = true;
            contador++;
        }

        return rta;
    }

    //Metodos


    @Override
    public String toString() {
        return "Pila{" +
                "Pila=" + Pila +
                ", contador=" + contador +
                '}';
    }
}
