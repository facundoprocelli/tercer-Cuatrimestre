/*
Crear una clase genérica llamada "Conjunto" que pueda almacenar elementos únicos
de cualquier tipo. Debe tener métodos para agregar y eliminar elementos, y para
verificar si un elemento está en el conjunto. Haz pruebas de tu clase con
diferentes tipos de elementos.
 */


import Modulo.Conjunto;
import Modulo.Persona;


public class Main {
    public static void main(String[] args) {

        Conjunto<Persona> conjunto = new Conjunto<>();

        Persona perso = new Persona("12345", "Facu");
        Persona perso1 = new Persona("12354645", "Facoiu");


        conjunto.agregar(perso);
        conjunto.agregar(perso1);

        System.out.println(conjunto);
        System.out.println(conjunto.buscarElemento(perso));
        conjunto.eliminar(perso);
        System.out.println(conjunto.buscarElemento(perso));
    }
}