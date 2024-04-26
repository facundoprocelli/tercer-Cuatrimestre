import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList<String> strings = new ArrayList<>(); // Los Métodos tienen que recibir un tipo de objeto
        strings.add("hola");

        // La clase object nos porvee metodos para sobreescribir
            // el comportaminto generico no nos importa, por eso lo sobrecargamos

         */

        // La herencia es la capcidad de usar maetodos que ne tengo escritos
        // Esto funciona porque herda un constructor de object
        Elemento aBuscar = new CD(2, "chai", 10);
        Elemento elemento = new CD(1,"Help", 12);
        Elemento elemento1 = new CD(1, "Help", 12);
        // Hay que entender el por que de las cosas, mas que solo de por que aparecen ( Leer documentación)
       // System.out.println(elemento.equals(elemento1.equals(null)));
        //Este metodo viene de la clase elemento

        ArrayList<Elemento> elementos = new ArrayList<>();
        elementos.add(elemento);
        elementos.add(elemento1);
        elementos.add(aBuscar);

      //  System.out.println(elementos);
       // System.out.println(elementos.remove(aBuscar));
      //  System.out.println(elementos);

       // System.out.println(Collections.frequency(elementos, aBuscar)); // Retorna la cantidad de veces que se repite

        //System.out.println(Collections.max(elementos));

        HashSet<Elemento> elementoHashSet = new HashSet<>();

        elementoHashSet.add(elemento);
        elementoHashSet.add(aBuscar);
        elementoHashSet.add(elemento1);


        System.out.println(elementoHashSet);
    }
}