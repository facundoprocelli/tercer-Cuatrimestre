package Modulo;

import Interface.IMetodosColecciones;

import java.util.Vector;

public class ColeccionVector implements IMetodosColecciones{

    private Vector<Double> vector;

    public  ColeccionVector() {
        vector = new Vector<>();
    }



    @Override
    public void agregar(double dato) {
        vector.add(dato);
    }



    @Override
    public void eliminar(double dato) {
        vector.remove(dato);
    }



    @Override
    public boolean buscar(double dato) {
        boolean rta = true;
        double pos = vector.indexOf(dato);
        if(pos == -1){
            rta = false;
        }
        return rta;
    }

    @Override
    public String listar() {
        StringBuilder rta = new StringBuilder();

        for (Double e : vector) {
            rta.append(e);
        }
        return rta.toString();
    }

    @Override
    public int contar() {
        return vector.size();
    }

/*
    @Override
    public int compareTo(Object o) {

        int rta = 0;

        if (o != null){


        }
    }

 */
}
