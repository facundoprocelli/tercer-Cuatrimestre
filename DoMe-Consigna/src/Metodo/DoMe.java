package Metodo;

import java.util.ArrayList;
import Metodo.Elemento;

public class DoMe {

    public DoMe() {

    }

    ArrayList<Elemento> elementos = new ArrayList<Elemento>(); // Coleccion de elementos ( DVD y CD)


    public void agregarCDaArrayList(Elemento ele, String interprete, int cantCanciones) {
        CD miCD = new CD(ele.getTitulo(), ele.getDuracion(), ele.isLoTengo(), ele.getComentario(), interprete, cantCanciones);
        elementos.add(miCD);

    }

    public void agregarDVDaArrayList(Elemento ele, String interprete) {
        DVD miDVD = new DVD(ele.getTitulo(), ele.getDuracion(), ele.isLoTengo(), ele.getComentario(), interprete);
        elementos.add(miDVD);
    }

    public void mostrarArrayListParticular(int op) {
        switch (op) {

            case 1:
                for (Elemento ele : elementos) {
                    if (ele instanceof CD) {
                        CD miCD = (CD) ele;
                        System.out.println(miCD.imprimir());
                    }
                }
                break;
            case 2:
                for (Elemento ele : elementos) {
                    if (ele instanceof DVD) {
                        DVD miDVD = (DVD) ele;
                        System.out.println(miDVD.imprimir());
                    }
                }
                break;
            case 3:
                for(Elemento ele: elementos){
                    if(ele instanceof CD) {
                        CD miCD = (CD) ele;
                        if(miCD.getNumeroDeTemas() > 10){
                            System.out.println(miCD.imprimir());
                        }
                    }
                }
                break;
            case 4:
                for(Elemento ele: elementos){
                    if ( ele instanceof  DVD) {
                        DVD miDVD = (DVD) ele;
                        if(miDVD.getDuracion() >100){
                            System.out.println(miDVD.imprimir());
                        }
                    }
                }
                break;

        }
    }
}
