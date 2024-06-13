package Modelo;


import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Gestora {


    public Gestora() {
    }

    public ListaGenerica<Persona> JsonAJava() throws JSONException {

        ListaGenerica<Persona> listaPersona = new ListaGenerica<>();
        //Tomo el Json Array de del JSON
        JSONArray ja = new JSONArray(JsonUtiles.leer("personas"));

        for (int i = 0; i < ja.length(); i++) {

            JSONObject jo = ja.getJSONObject(i);

            //Agarro todos los tags
            ArrayList<String> tags = new ArrayList<>();
            JSONArray jaTag = jo.getJSONArray("tags");
            for (int k = 0; k < jaTag.length(); k++) {

                tags.add(jaTag.getString(k));
            }

            //Agarro todos los amigos
            ArrayList<Amigo> amigos = new ArrayList<>();
            JSONArray jaFirends = jo.getJSONArray("friends");
            for (int y = 0; y < jaFirends.length(); y++) {
                JSONObject joFirend = jaFirends.getJSONObject(y);

                Amigo a = new Amigo(joFirend.getInt("id"),
                        joFirend.getString("name"));

                amigos.add(a);
            }

            //Cargo a la persona
            Persona persona = new Persona(jo.getString("_id"),
                    jo.getBoolean("isActive"),
                    jo.getString("balance"),
                    jo.getString("eyeColor"),
                    jo.getString("name"),
                    jo.getString("gender"),
                    jo.getInt("age"),
                    tags,
                    amigos
            );

            listaPersona.agregar(persona);
        }


        return listaPersona;
    }


    public ListaGenerica<Persona> listaMayores(ListaGenerica<Persona> listaGenerica) {
        ListaGenerica<Persona> peronasMayores = new ListaGenerica<>();

        for (int i = 0; i < listaGenerica.contar(); i++) {
            Persona p = listaGenerica.buscarXPos(i);
            if (p.getAge() >= 18) {
                peronasMayores.agregar(p);
            } else {
                System.out.println(new esMenorException(p.getAge()));

            }
        }

        return peronasMayores;
    }


    public HashSet<Amigo> listaDeAmigos(ListaGenerica<Persona> listaGenerica) {

        HashSet<Amigo> amigos = new HashSet<>();

        for (int i = 0; i < listaGenerica.contar(); i++) {

            ArrayList<Amigo> amigoActual = listaGenerica.buscarXPos(i).getAmigos();

            for (Amigo amigo : amigoActual) {
                amigos.add(amigo);
            }
        }
        return amigos;
    }


    public HashMap<String, ArrayList<String>> mapaDeTags(ListaGenerica<Persona> listaGenerica) {

        HashMap<String, ArrayList<String>> mapaDeTagsActual = new HashMap<>();

        for (int i = 0; i < listaGenerica.contar(); i++) {
            Persona p = listaGenerica.buscarXPos(i);

            mapaDeTagsActual.put(p.get_id(), p.getTags());

        }
        return mapaDeTagsActual;
    }


    public int cantidadDeEtiquetas(String id, int sizeEtiquta, ListaGenerica<Persona> listaGenerica) {
        int cantidadEtiquetas = 0;
        for (int i = 0; i < listaGenerica.contar(); i++) {

            Persona p = listaGenerica.buscarXPos(i);
            if (p.get_id().equals(id)) {

                ArrayList<String> etiquetas = p.getTags();
                for (String e : etiquetas) {

                    if (e.length() >= sizeEtiquta) {
                        cantidadEtiquetas++;
                    }
                }
            }
        }

        return cantidadEtiquetas;
    }

    public void grabarArchivoXSaldo(double saldo, ListaGenerica<Persona> listaGenerica) {

        //Creo el objeto que voy a Escribir
        ObjectOutputStream objectOutputStream = null;


        try {
            //Le digo de donde voy a Escribir al objeto
            FileOutputStream fileOutputStream = new FileOutputStream("Sueldos.bin");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Recorro el arreglo y guardo los elementos que correspondan
            for (int i = 0; i < listaGenerica.contar(); i++) {
                Persona p = listaGenerica.buscarXPos(i);
                //Le doy formato al balance para poder trabajar con este
                Double balance = Double.parseDouble(p.getBalance().replaceAll("[$,]", ""));

                if (balance > saldo) {
                    objectOutputStream.writeObject(p);
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

    public ArrayList<Persona> leerArchivoSueldo() {

        //Creo el OIS y el Arraylist para usar mas tarde
        ObjectInputStream objectInputStream = null;
        ArrayList<Persona> personas = new ArrayList<>();

        try {
            //Abro el archivo y digo de que archivo va a recibir info el OIS
            FileInputStream fileInputStream = new FileInputStream("Sueldos.bin");
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                //Guardo todas las personas en el arraylist
                Persona p = (Persona) objectInputStream.readObject();
                personas.add(p);
            }
        } catch (EOFException e) {
            System.out.println("Termino el archivo");
        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Problemas para escribir y leer");
        } catch (ClassNotFoundException e) {
            System.out.println("no se encontro la clase");
        } finally {
            try {
                objectInputStream.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return personas;
    }

}
