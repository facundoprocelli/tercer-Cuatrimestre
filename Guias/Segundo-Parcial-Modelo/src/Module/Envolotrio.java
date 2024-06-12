package Module;

import Exceptions.sobrePasaCantidadException;
import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Envolotrio implements Serializable {
    private ContenedorGenerico<String, Jugador> tablaOjos;
    private ContenedorGenerico<String, Jugador> tablaPosiciones;

    public Envolotrio() {
        tablaOjos = new ContenedorGenerico<String, Jugador>();
        tablaPosiciones = new ContenedorGenerico<String, Jugador>();

    }


    public JSONArray abrirJsonArray() {
        JSONArray jsonArray = null;

        try {
            jsonArray = new JSONArray(JsonUtiles.leer("jugadores"));
        } catch (
                JSONException e) {
            throw new RuntimeException(e);
        }
        return jsonArray;
    }


    public ArrayList<Jugador> cargarTablas() throws JSONException {

        JSONArray jsonArray = abrirJsonArray();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jo = null;
            try {
                jo = jsonArray.getJSONObject(i);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

            JSONObject nombre = jo.getJSONObject("name");
            name n = new name(nombre.getString("first"), nombre.getString("last"));

            Jugador jugador = new Jugador(jo.getString("_id"),
                    jo.getString("guid"),
                    jo.getBoolean("isActive"),
                    jo.getString("balance"),
                    jo.getInt("age"),
                    jo.getString("eyeColor"),
                    n,
                    jo.getString("email"),
                    jo.getString("phone"),
                    jo.getString("position"));

            cargarTablaOjos(jugador);
            cargarTablaPosiciones(jugador);
            jugadores.add(jugador);
        }
        return jugadores;
    }


    public void cargarTablaOjos(Jugador jugador) {
        HashSet<Jugador> jugadorHashSet = null;
        if (tablaOjos.getContenedor().containsKey(jugador.getEyeColor())) {
            //Agarro el hashSet que se adecue a el color
            jugadorHashSet = tablaOjos.getContenedor().get(jugador.getEyeColor());
            //Agrego el jugador al HashSet
            jugadorHashSet.add(jugador);
        } else {
            //Creo el HashSet
            jugadorHashSet = new HashSet<>();
            //Agrego el Jugador
            jugadorHashSet.add(jugador);
            //Agrego el nuevo HashSet al HashMap
            tablaOjos.agregar(jugador.getEyeColor(), jugadorHashSet);
        }

    }

    public void cargarTablaPosiciones(Jugador jugador) {
        HashSet<Jugador> jugadorHashSet = null;
        if (tablaPosiciones.getContenedor().containsKey(jugador.getPosition())) {
            //Agarro el hashSet que se adecue a el color
            jugadorHashSet = tablaPosiciones.getContenedor().get(jugador.getPosition());
            //Agrego el jugador al HashSet
            jugadorHashSet.add(jugador);
        } else {
            //Creo el HashSet
            jugadorHashSet = new HashSet<>();
            //Agrego el Jugador
            jugadorHashSet.add(jugador);
            //Agrego el nuevo Hashset a el HashMap
            tablaPosiciones.agregar(jugador.getPosition(), jugadorHashSet);
        }

    }


    public int cantidadElementos(String tabla, String key, int cantidad) throws sobrePasaCantidadException {
        ContenedorGenerico<String, Jugador> contenedorGenerico = null;
        if (tabla.equals("color")) {
            contenedorGenerico = tablaOjos;
        } else {
            contenedorGenerico = tablaPosiciones;
        }
        if (contenedorGenerico.contar() > cantidad) {
            throw new sobrePasaCantidadException(tabla, key, contenedorGenerico.contar() - cantidad);
        }

        return contenedorGenerico.contar();
    }


    public void grabarEnArchivoSueldo(Double sueldo, ArrayList<Jugador> jugadores) {

        //Creo un objeto para sacar del canal (para llevar a otro lado)
        ObjectOutputStream objectOutputStream = null;

        try {
            //Abro el archivo en donde voy a sacar los objetos
            FileOutputStream fileOutputStream = new FileOutputStream("JugadoresXSueldo.bin");
            //Defino a donde voy a sacar los objetos
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Hago un bucle para poder guardar todos los jugadores que correspondan
            for (Jugador jugador : jugadores) {
                //Parseo el balance a sueldo actual, para que me quede un double y lo pueda comparar mas facil
                Double sueldoActual = Double.parseDouble(jugador.getBalance().replaceAll("[$,]", ""));
                if (sueldoActual > sueldo) {
                    //Escribo el objeto en el archivo y avanzo.
                    objectOutputStream.writeObject(jugador);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Jugador> leerArchvioSueldos() {

        //Creo el objeto que voy a traer de otro canal
        ObjectInputStream objectInputStream = null;
        //Creo el arraylist donde guardarlo
        ArrayList<Jugador> jugadores = new ArrayList<>();

        try {
            //Abro el archvio que quiero leer
            FileInputStream fileInputStream = new FileInputStream("JugadoresXSueldo.bin");
            //Le digo a mi objeto de donde va a venir la información
            objectInputStream = new ObjectInputStream(fileInputStream);
            //Mientras haya elementos en el archivo
            while (true) {
                //Leo el objeto y avanzo una posición
                Jugador j = (Jugador) objectInputStream.readObject();
                //Verifico que no esten repetidos
                if (!verificarRepetidos(j.get_id(), jugadores)) {
                    //Agrego al arrayList
                    jugadores.add(j);
                }
            }
        } catch (EOFException e) {
            System.out.println("Termino el archivo");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro la clase");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return jugadores;
    }

    public boolean verificarRepetidos(String _id, ArrayList<Jugador> jugadores) {

        boolean rta = false;
        for (Jugador jugador : jugadores) {

            if (_id.equals(jugador.get_id())) {
                rta = true;
            }
        }
        return rta;


    }

    @Override
    public String toString() {
        return "Envolotrio{" +
                "tablaOjos=" + tablaOjos + "\n" +
                ", tablaPosiciones=" + tablaPosiciones +
                '}';
    }
}





