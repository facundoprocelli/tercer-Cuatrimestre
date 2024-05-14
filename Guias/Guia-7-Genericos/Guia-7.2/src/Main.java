import Modulo.Automovil;
import Modulo.Motos;
import Modulo.Pila;

/*
Crear una clase genérica llamada "Pila" que funcione como una pila de objetos.
Debe tener métodos para agregar y quitar elementos de la pila, así como para
verificar si está vacía y para obtener el número de elementos en la pila.
Haz pruebas de tu clase con diferentes tipos de objetos.
 */
public class Main {
    public static void main(String[] args) {

        Pila<Automovil> automovilPila = new Pila<>();

        Automovil auto = new Automovil("Forda", "Modeon");
        Automovil auto2 = new Automovil("Chevy", "Montana");
        Automovil auto3 = new Automovil("Volkswagen", "Polo");

        automovilPila.agregar(auto);
        automovilPila.agregar(auto2);
        automovilPila.agregar(auto3);

        System.out.println(automovilPila.contar());

        System.out.println(automovilPila.buscar(auto2));
        automovilPila.eliminar();
        System.out.println(automovilPila.buscar(auto3));

        //---------------------------------------------------------
        Pila< Motos> motosPila = new Pila<>();

        Motos moto1 = new Motos("123", "asdf");
        Motos moto2 = new Motos("12324", "assafd");

        motosPila.agregar(moto1);
        motosPila.agregar(moto2);

        System.out.println(motosPila.contar());
        System.out.println(motosPila.buscar(moto2));
        motosPila.eliminar();
        System.out.println(motosPila.buscar(moto2));


    }
}