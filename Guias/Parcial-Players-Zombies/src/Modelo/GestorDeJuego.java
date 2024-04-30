package Modelo;

import java.util.ArrayList;

public class GestorDeJuego {

    private ArrayList<Personaje>personajeArrayList;
    private ArrayList<Objeto>objetoArrayList;

    public GestorDeJuego() {
        this.personajeArrayList = new ArrayList<Personaje>();
        this.objetoArrayList = new ArrayList<Objeto>();
    }

    public ArrayList<Objeto> getObjetoArrayList() {
        return objetoArrayList;
    }

    public ArrayList<Personaje> getPersonajeArrayList() {
        return personajeArrayList;
    }


    //Metodos
    public void agregarPersonaje(Personaje personaje){
        personajeArrayList.add(personaje);
    }

    public void agregarObjeto(Objeto objeto){
        objetoArrayList.add(objeto);
    }


    @Override
    public String toString() {
        return "\n" + "GestorDeJuego{" + "\n" +
                "personajeArrayList=" + personajeArrayList + "\n" +
                ", objetoArrayList=" + objetoArrayList +
                '}';
    }
}
