import Modelo.ArraysReales;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        ArraysReales arraysReales = new ArraysReales();

        arraysReales.lista();
        arraysReales.agregar(4.5);
        arraysReales.agregar(6.5);
        arraysReales.agregar(47.4);
        arraysReales.agregar(2.8);
        arraysReales.agregar(3.9);


        System.out.println( arraysReales.recorrer());

        System.out.println(arraysReales.maximo());
        System.out.println(arraysReales.minimo());
        System.out.println(arraysReales.sumatoria());
    }



}