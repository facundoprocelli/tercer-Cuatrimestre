package Modulo;

import java.util.ArrayList;

public class Contenedor <E> {

    //Contenedor
    private ArrayList<E> lista;

    //Constructor
    public Contenedor() {
        this.lista = new ArrayList<>();
    }

    //Getters y Setters
    public ArrayList<E> getLista() {
        return lista;
    }

    //Metodos
    public void agregar(E obj){
        lista.add(obj);
    }

    public boolean eliminar(E obj){
        return lista.remove(obj);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "lista=" + lista +
                '}' + "\n";
    }
}
