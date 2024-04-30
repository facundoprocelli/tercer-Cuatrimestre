package Modulo;

import Interface.IMetodosColecciones;

import java.util.HashSet;
import java.util.Iterator;

public class ColeccionHashSet implements IMetodosColecciones {

    private HashSet<Double> hashSet;

    public ColeccionHashSet(){
        hashSet = new HashSet<>();
    }
    @Override
    public void agregar(double dato) {
        hashSet.add(dato);
    }

    @Override
    public void eliminar(double dato) {
        hashSet.remove(dato);
    }

    @Override
    public boolean buscar(double dato) {
        return hashSet.contains(dato);
    }

    @Override
    public String listar() {
        StringBuilder mensaje = new StringBuilder();
        Iterator<Double> doubleIterator = hashSet.iterator();

        while ((doubleIterator.hasNext())){
            Double aux = doubleIterator.next();
            mensaje.append(aux);
        }

        return mensaje.toString();
    }

    @Override
    public int contar() {
        return hashSet.size();
    }

    @Override
    public String toString() {
        return "ColeccionHashSet{" +
                "hashSet=" + hashSet +
                '}';
    }

}
