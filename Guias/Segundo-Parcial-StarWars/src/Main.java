import Exceptions.PersonajeNoEncontradoException;
import modelo.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creo gestora para gestionar el proyecto
        Gestora gestora = new Gestora();

        //Creo una pelicula en donde voy a guardar los personajes de StarWars
        Pelicula p = new Pelicula();
        StarWarsRegistro<Personaje> registro = gestora.pasarDeJSONaJAVA();
        p.setPersonajes(registro);

        System.out.println("Imprimo el registro cargado");
        System.out.println(registro.listarPersonajes() + " \n\n\n");

        //Busco un personaje por nombre y si no esta lanzo una excepcion

        Personaje personajeBuscado = null;
        try {
            System.out.println("Busco personaje\n");
           personajeBuscado=  registro.obtenerPersonajePorNombre("Darth Vader");
            System.out.println(personajeBuscado);
        } catch (PersonajeNoEncontradoException e) {
            System.out.println(e);
        }

        //elimino un personaje
        System.out.println("Elimino personaje");
        System.out.println(registro.eliminarPersonaje(personajeBuscado));
        System.out.println( "\n" + registro.listarPersonajes());

        //Grabo los datos de las naves en el archvio
        gestora.grabarArchivoNaves(p.getPersonajes());

        //Leo las naves de los archvios
        ArrayList<Nave> naves = gestora.leerArchivoNaves();
        System.out.println("Naves de los amigos\n");
        System.out.println(naves);

        //Vacio el registro

        registro.limpiar();
        System.out.println("Vacio el registro");
        System.out.println(registro);

    }
}