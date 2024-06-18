package modelo;

import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Gestora {

    public Gestora() {
    }

    public StarWarsRegistro<Personaje> pasarDeJSONaJAVA() {

        StarWarsRegistro<Personaje> personajeStarWarsRegistro = new StarWarsRegistro<>();

        try {
            // Agarro los personajes del json
            JSONObject jo = new JSONObject(JsonUtiles.leer("personajes"));

            //Agarro el array de los personajes
            JSONArray jaPersonajes = jo.getJSONArray("personajes");

            for (int i = 0; i < jaPersonajes.length(); i++) {

                JSONObject joPerson = jaPersonajes.getJSONObject(i);

                // Agarro las habilidades y los maestros
                JSONObject joMaestro = joPerson.getJSONObject("maestro");
                JSONArray habilidades = joMaestro.getJSONArray("habilidades");

                //Agrego habilidades
                ArrayList<String> ha = new ArrayList<>();
                for (int k = 0; k < habilidades.length(); k++) {
                    ha.add( habilidades.getString(k));
                }

                //Agrego maestros
                Maestro maestro = new Maestro(joMaestro.getString("nombre"),
                        joMaestro.getBoolean("es_jedi"),
                        ha);


                //Agrego los amigos
                JSONArray jaAmigos = joPerson.getJSONArray("amigos");
                ArrayList<Amigo> amigosArraylist = new ArrayList<>();

                for (int y = 0; y < jaAmigos.length(); y++) {

                    JSONObject joAmigoActual = jaAmigos.getJSONObject(y);

                    //Agrego la info de la nave
                    if(!joAmigoActual.isNull("nave")) {
                        JSONObject joNave = joAmigoActual.getJSONObject("nave");

                           Nave nave = new Nave(joNave.getString("nombre"),
                                    joNave.getString("modelo"));

                        //Cargo al amigo
                        Amigo amigo = new Amigo(joAmigoActual.getString("nombre"),
                                joAmigoActual.getBoolean("piloto"),
                                nave);

                        amigosArraylist.add(amigo);
                    }
                }

                //Agarro los eventos
                JSONArray jaEventos = joPerson.getJSONArray("eventos");
                ArrayList<Evento> eventos = new ArrayList<>();

                for(int e = 0; e < jaEventos.length(); e++){

                    JSONObject eventoActual = jaEventos.getJSONObject(e);
                    Evento evento = new Evento(eventoActual.getString("nombre"),
                            eventoActual.getInt("anio"),
                            eventoActual.getBoolean("ganada"));

                    eventos.add(evento);

                }

                //Cargo toda la información en el personaje
                Personaje p = new Personaje(joPerson.getString("nombre"),
                        joPerson.getInt("edad"),
                        joPerson.getBoolean("jedi"),
                        joPerson.getString("planeta_nacimiento"),
                        maestro,
                        amigosArraylist,
                        eventos);

                //Agrego el personaje al registro
                personajeStarWarsRegistro.agregarPersonaje(p);
            }


        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return personajeStarWarsRegistro;
    }


    public void grabarArchivoNaves (StarWarsRegistro<Personaje> registro){

        ObjectOutputStream objectOutputStream = null;

        try {
            //Abro el archivo
            FileOutputStream fileOutputStream = new FileOutputStream("naves.bin");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

                //Creo un iterator para recorrer el registro
                Iterator iterator = registro.getHashSetGenerico().iterator();

                while (iterator.hasNext()){

                    //agarro al personaje actual
                    Personaje p = (Personaje) iterator.next();
                    ArrayList<Amigo> amigos= p.getAmigos();

                    //Busco en sus amigos
                    for(Amigo amigo : amigos){

                        //Si tiene nave la agrego
                        if(amigo.getNave() != null){
                            Nave nav = amigo.getNave();
                            objectOutputStream.writeObject(nav);

                        }
                    }
                }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public ArrayList<Nave> leerArchivoNaves() {

        ObjectInputStream objectInputStream = null;
        ArrayList<Nave> naves = new ArrayList<>();

        try {
            //Abro el archivo
            FileInputStream fileInputStream = new FileInputStream("naves.bin");
            objectInputStream = new ObjectInputStream(fileInputStream);

            //Agrego las naves al arreglo
            while (true) {
                Nave naveActual = (Nave) objectInputStream.readObject();
                naves.add(naveActual);
            }


        } catch (EOFException e ){

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return naves;
    }

}
