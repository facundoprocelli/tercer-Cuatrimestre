package Modulo;

import Excepciones.edadInusficienteExcepction;
import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

public class Gestora {

    public Gestora() {
    }

    public ListaGenerica<Trabajador> cargarListaDeJSON() {

        ListaGenerica<Trabajador> trabajadores = new ListaGenerica<>();
        try {
            JSONArray ja = new JSONArray(JsonUtiles.leer("empleados"));

            for (int i = 0; i < ja.length(); i++) {
                JSONObject jo = ja.getJSONObject(i);

                JSONObject joContact = jo.getJSONObject("contacts");
                Contacto c = new Contacto(joContact.getString("email"),
                        joContact.getString("phone"));

                Trabajador t = new Trabajador(jo.getString("_id"),
                        jo.getString("name"),
                        jo.getBoolean("isActive"),
                        jo.getString("balance"),
                        jo.getInt("age"),
                        jo.getString("eyeColor"),
                        jo.getString("job"),
                        c);

                trabajadores.agregar(t);
            }

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return trabajadores;
    }


    public void guardarTrabajadoresEnArchvios(ListaGenerica<Trabajador> lista, String trabajo) {

        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(trabajo + ".bin");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);


            for (int i = 0; i < lista.contar(); i++) {
                Trabajador t = lista.buscarXPos(i);

                if (t.getJob().equals(trabajo)) {
                    objectOutputStream.writeObject(t);
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


    public ListaGenerica<Trabajador> leerArchvioTrabajadores(String trabajo) {

        ListaGenerica<Trabajador> listaGenerica = new ListaGenerica<>();
        ObjectInputStream objectInputStream = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(trabajo + ".bin");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                Trabajador t = (Trabajador) objectInputStream.readObject();
                listaGenerica.agregar(t);
            }
        } catch (EOFException e) {
            System.out.println("Se termino el archivo");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return listaGenerica;
    }

    public ListaGenerica<Trabajador> trabajadoresVeteranos(ListaGenerica<Trabajador> lista, int edadMinima) throws edadInusficienteExcepction {

        ListaGenerica<Trabajador> listaVeteranos = new ListaGenerica<>();

        for (int i = 0; i < lista.contar(); i++) {

            Trabajador t = lista.buscarXPos(i);

            if (t.getAge() >= edadMinima) {
                listaVeteranos.agregar(t);
            } else {
                throw (new edadInusficienteExcepction(t.getAge(), edadMinima));

            }
        }
        return listaVeteranos;
    }

}
