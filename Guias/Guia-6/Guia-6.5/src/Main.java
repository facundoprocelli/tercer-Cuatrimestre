import Modulo.Pila;

public class Main {

    /* Escribe una interfaz, llamada ColeccionInterfaz, que declare los siguientes métodos:

estaVacia(): devuelve true si la colección está vacía y false en caso contrario.
extraer(): devuelve y elimina el primer elemento de la colección.
primero(): devuelve el primer elemento de la colección.
añadir(): añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.






Escribe una clase Pila, que implemente esta interfaz, utilizando para ello un ArrayList de int y un contador de objetos.

     */
    public static void main(String[] args) {

        Pila pila = new Pila();

        System.out.println(pila.agregarElemento(5));
        System.out.println(pila.agregarElemento(6));
        System.out.println(pila.agregarElemento(7));
        System.out.println(pila.agregarElemento(8));
        System.out.println(pila.agregarElemento(9));

        System.out.println(pila.estaVacia());
        System.out.println(pila.primero());
        System.out.println(pila.extraer());
        System.out.println(pila);

    }
}