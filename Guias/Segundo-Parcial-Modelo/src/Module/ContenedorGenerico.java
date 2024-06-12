package Module;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

public class ContenedorGenerico <K, J>  implements Serializable {

    private HashMap<K, HashSet<Jugador>> contenedor;

    public ContenedorGenerico() {
        contenedor = new HashMap<K, HashSet<Jugador>>();
    }

    public void agregar(K key, HashSet<Jugador> value) {
        contenedor.put(key, value);
    }

    public HashSet<Jugador> devolverXClave(K key) {
        return contenedor.get(key);
    }

    public String listar() {
        return this.toString();
    }

    public int contar() {
        return contenedor.size();
    }

    public HashMap<K, HashSet<Jugador>> getContenedor() {
        return contenedor;
    }



    @Override
    public String toString() {
        return "ContenedorGenerico{" +
                "contenedor=" + contenedor +
                '}' + "\n";
    }
}
