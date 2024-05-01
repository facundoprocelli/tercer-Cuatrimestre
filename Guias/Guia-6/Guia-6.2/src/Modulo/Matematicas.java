package Modulo;

import Interfaces.IExtremos;

import java.util.Iterator;
import java.util.LinkedList;

public class Matematicas implements IExtremos {

    private LinkedList<Double> doubleLinkedList;

    public Matematicas(){
        doubleLinkedList = new LinkedList<Double>();
    }

    public void agregar(double dato){
        doubleLinkedList.add(dato);
    }

    @Override
    public double inicio() {
        return doubleLinkedList.getFirst();
    }

    @Override
    public double fin() {
        return doubleLinkedList.getLast();
    }

    @Override
    public String toString() {
        return "Matematicas{" +
                "doubleLinkedList=" + doubleLinkedList +
                '}';
    }

    public String Mostrar(){
        Iterator<Double> it = doubleLinkedList.iterator();
        String mensaje = "";
        while (it.hasNext()){

            mensaje += it.next() + "\n";
        }

        return  mensaje;
    }
}
