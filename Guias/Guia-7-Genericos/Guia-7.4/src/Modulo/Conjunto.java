package Modulo;
import java.util.HashSet;

public class Conjunto<E> {

    private HashSet<E> conjunto;

    public Conjunto() {
        this.conjunto = new HashSet<>();
    }

    public void agregar(E dato){
        conjunto.add(dato);
    }

    public void eliminar(E dato){
        conjunto.remove(dato);
    }

    public boolean buscarElemento(E dato){
        return conjunto.contains(dato);
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "conjunto=" + conjunto +
                '}';
    }


}
