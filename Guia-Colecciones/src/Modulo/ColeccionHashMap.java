package Modulo;

import Interface.IMetodosColecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ColeccionHashMap implements IMetodosColecciones {


    private HashMap<Double, String> integerStringHashMap;

    public ColeccionHashMap() {
        this.integerStringHashMap = new HashMap<Double,String>();
    }

    @Override
    public void agregar(double dato) {

    }

    public void ponerElemento(Double clave, String valor){
        integerStringHashMap.put(clave, valor);
    }

    @Override
    public void eliminar(double key) {
        integerStringHashMap.remove(key);
    }

    @Override
    public boolean buscar(double key) {
        return integerStringHashMap.containsKey(key);
    }

    @Override
    public String listar() {
        StringBuilder mensaje = new StringBuilder();
        Iterator<Map.Entry<Double, String>> entryIterator = integerStringHashMap.entrySet().iterator();

        while(entryIterator.hasNext()){
            mensaje.append(entryIterator.next());
        }

        return mensaje.toString();
    }

    @Override
    public int contar() {
        return integerStringHashMap.size();
    }
}
