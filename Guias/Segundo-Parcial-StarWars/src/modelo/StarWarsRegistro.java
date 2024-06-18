package modelo;

import Exceptions.PersonajeNoEncontradoException;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

public class StarWarsRegistro<T>  implements Serializable {

    private HashSet<T> hashSetGenerico;

    public StarWarsRegistro() {
        this.hashSetGenerico = new HashSet<>();
    }

    public void agregarPersonaje(T personaje) {
        hashSetGenerico.add(personaje);
    }


    //Metodo que devuleve el primer personaje encontrado con determiando nombre
    public Personaje obtenerPersonajePorNombre(String nombre) throws PersonajeNoEncontradoException {

        Personaje personaje = null;
        boolean flag = false;

        for (T p : hashSetGenerico) {
            if (p instanceof Personaje perso) {
                if (perso.getNombre().equals(nombre)) {
                    personaje = perso;
                    flag = true;
                }
            }
        }
        if (!flag) {
            throw new PersonajeNoEncontradoException(nombre);
        }

        return personaje;
    }

    public boolean eliminarPersonaje(T personaje) {
        return hashSetGenerico.remove(personaje);
    }

    public String listarPersonajes() {
        return hashSetGenerico.toString();
    }


    public void limpiar() {
            hashSetGenerico.clear();
    }

    public HashSet<T> getHashSetGenerico() {
        return hashSetGenerico;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
