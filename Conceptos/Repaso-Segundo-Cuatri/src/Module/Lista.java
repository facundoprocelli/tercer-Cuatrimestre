package Module;

import java.util.ArrayList;

public class Lista<E> {

    private ArrayList<E> lista;

    public Lista(){
        lista = new ArrayList<>();
    }

    public void  enlistar(E dato){
        lista.add(dato);
    }

    public int tamano(){
        return lista.size();
    }

    public E agarrar(int i){
        return lista.get(i);
    }
    public void vaciarLista(){
        lista.clear();
    }
    public void  desenlistarXindice(int index){

        lista.remove(index);
    }

    public boolean desenlistarXObjeto(E e){

    return lista.remove(e);
    }

    @Override
    public String toString() {
        return "Lista{" +
                "lista=" + lista +
                '}';
    }
}
