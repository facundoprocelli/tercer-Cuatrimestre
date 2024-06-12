package Modelo;

import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Consecionario implements Serializable {

    private String nombre;
    private String ubicacion;

    private ListaGenerica<Automovil> automovils;

    public Consecionario(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.automovils = new ListaGenerica<>();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public ListaGenerica<Automovil> getAutomovils() {
        return automovils;
    }

    public void guardarAutosEnConsecionario(ArrayList<Automovil> autos) {

        ListaGenerica<Automovil> lista = this.getAutomovils();

        for (Automovil automovil : autos) {
            lista.agregar(automovil);
        }
    }

    public void guardarAutosEnJSON(ListaGenerica<Automovil> listaGenerica) throws JSONException {

        JSONArray ja = new JSONArray();

        for (int i = 0; i < listaGenerica.contar(); i++) {

            Automovil auto = listaGenerica.buscarXindice(i);
            Especificaciones especificaciones = auto.getEspecificaciones();

            JSONObject joEscpecificaciones = new JSONObject();
            joEscpecificaciones.put("velocidadMaxima", especificaciones.getVelocidadMaxima());
            joEscpecificaciones.put("caballosDeFuerza", especificaciones.getCaballosDeFuerza());
            joEscpecificaciones.put("peso", especificaciones.getVelocidadMaxima());
            joEscpecificaciones.put("consumo", especificaciones.getPeso());


            JSONObject jo = new JSONObject();
            jo.put("marca", auto.getMarca());
            jo.put("modelo", auto.getModelo());
            jo.put("especificaciones", joEscpecificaciones);

            ja.put(jo);

        }

        JsonUtiles.grabar(ja);
    }

    public JSONArray abrirJsonArray(String nombre) {

        JSONArray ja = null;

        try {
            ja = new JSONArray(JsonUtiles.leer(nombre));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return ja;
    }

    public ListaGenerica<Automovil> leerAutosDelJSON() {

        ListaGenerica<Automovil> listaGenerica = new ListaGenerica<>();
        JSONArray ja = abrirJsonArray("test");

        for (int i = 0; i < ja.length(); i++) {

            try {
                JSONObject jo = ja.getJSONObject(i);

                //Agarro el objeto que esta dentro del objeto
                JSONObject jsEsp = jo.getJSONObject("especificaciones");

                Especificaciones especificaciones = new Especificaciones(jsEsp.getInt("velocidadMaxima"),
                        jsEsp.getDouble("consumo"),
                        jsEsp.getDouble("caballosDeFuerza"),
                        jsEsp.getDouble("peso")
                );

                Automovil automovil = new Automovil(jo.getString("marca"),
                        jo.getString("modelo"),
                        especificaciones);

                listaGenerica.agregar(automovil);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return listaGenerica;
    }

    public void guardarEnArchivoBinario(int velocidad) {

        ObjectOutputStream objectOutputStream = null;
        ListaGenerica<Automovil> listaGenerica = leerAutosDelJSON();


        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("AutosRapidos.bin");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (int i = 0; i < listaGenerica.contar(); i++) {
                Automovil auto = listaGenerica.buscarXindice(i);

                if (auto.getEspecificaciones().getVelocidadMaxima() > velocidad) {
                    objectOutputStream.writeObject(auto);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public ListaGenerica<Automovil> sacarDeArchivoBinario() {

        ObjectInputStream objectInputStream = null;
        ListaGenerica<Automovil> automovilListaGenerica = new ListaGenerica<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("AutosRapidos.bin");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                Automovil auto = (Automovil) objectInputStream.readObject();
                automovilListaGenerica.agregar(auto);
            }

        } catch (EOFException e) {
            System.out.println("Termina el archivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

return automovilListaGenerica;
    }

    @Override
    public String toString() {
        return "Consecionario{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", automovils=" + automovils +
                '}';
    }
}
