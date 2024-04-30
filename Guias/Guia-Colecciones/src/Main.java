import Modulo.ColeccionHashMap;
import Modulo.ColeccionHashSet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
/*
        ColeccionVector vector = new ColeccionVector();

        vector.agregar(3);
        vector.agregar(6);
        vector.agregar(9);

        System.out.println(vector.contar());

        boolean esta = vector.buscar(10);
        System.out.println(esta);

        vector.eliminar(10);

        System.out.println(vector.listar());
        */
/*
        //----------------------------------------------------------
        //------------------HASHSET----------------------------------------
        //----------------------------------------------------------
        ColeccionHashSet coleccionHashSet = new ColeccionHashSet();

        coleccionHashSet.agregar(5);
        coleccionHashSet.agregar(6);
        coleccionHashSet.agregar(7);

        String mensaje = coleccionHashSet.listar();
        System.out.println(mensaje);

        coleccionHashSet.eliminar(6);

        mensaje = coleccionHashSet.listar();
        System.out.println(mensaje);

        int cantidad = coleccionHashSet.contar();
        System.out.println(cantidad);

        System.out.println(coleccionHashSet);

        boolean esta = coleccionHashSet.buscar(6);
        boolean esta2 = coleccionHashSet.buscar(7);

        System.out.println(esta);
        System.out.println(esta2);
*/

        //----------------------------------------------------------
        //------------------HASHMAP----------------------------------------
        //----------------------------------------------------------

        ColeccionHashMap coleccionHashMap = new ColeccionHashMap();

        coleccionHashMap.ponerElemento(23.0,"Facu");
        coleccionHashMap.ponerElemento(34.0,"Agus");
        coleccionHashMap.ponerElemento(56.0,"Nico");

        System.out.println(coleccionHashMap.buscar(23.0));

        coleccionHashMap.eliminar(34);
        System.out.println(coleccionHashMap.contar());

        System.out.println(coleccionHashMap.listar());

    }
}