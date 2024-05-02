package Interfaces;

public interface IColeccionInterfaz {

    boolean estaVacia(); // Devuelve true si esta vacia, false en lo contrario
    int extraer(); //Elimina un elemento y lo devuelve
    int primero(); // Devuelve el primer elemento de la coleccion
    boolean agregarElemento(int num); // Agrega un elemento y devuelve true si lo hizo, false en el contrario
}
