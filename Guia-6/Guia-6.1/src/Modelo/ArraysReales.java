package Modelo;

import Interfaces.IEstadisticas;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class ArraysReales implements IEstadisticas {

    private LinkedHashSet<Double> lista;

    public void lista() {
        lista = new LinkedHashSet<>();
    }

    public void agregar(Double dato) {
        lista.add(dato);
    }


    public String recorrer() {


            Iterator<Double> it = lista.iterator();
            StringBuilder mensaje = new StringBuilder();

            if(!lista.isEmpty()) {
                while (it.hasNext()) {
                    mensaje.append(it.next());
                    mensaje.append("\n");
                }
            }
        return mensaje.toString();
    }


    @Override
    public String toString() {
        return "ArraysReales{" +
                "lista=" + lista +
                '}';
    }

    @Override
    public double minimo() {
        double minimo = lista.getFirst();
        Iterator<Double> it = lista.iterator();

        if(!lista.isEmpty()) {
            while (it.hasNext()) {
                if (minimo < lista.getFirst()) {
                    minimo = lista.getFirst();
                }
                it.next();
            }
        }
        return minimo;
    }

    @Override
    public double maximo() {
            double maximo = 0.0;
            Iterator<Double> it = lista.iterator();
        if(!lista.isEmpty()) {
                    maximo = lista.getFirst();
            while (it.hasNext()) {
                if (maximo < lista.getFirst()) {
                    maximo = lista.getFirst();
                }
                it.next();
            }
        }
            return maximo;
    }

    @Override
    public double sumatoria() {
        Iterator<Double> it = lista.iterator();
        double dob = 0.0;
        if(!lista.isEmpty()){
            while (it.hasNext()){
                dob += it.next();
            }
        }
        return dob;
    }


}