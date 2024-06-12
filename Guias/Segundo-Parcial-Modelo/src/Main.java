import Exceptions.sobrePasaCantidadException;
import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import Module.*;
import org.json.JSONObject;
import Module.Envolotrio;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Envolotrio envolotrio = new Envolotrio();
        ArrayList<Jugador> jugadores = null;
        try {
          jugadores =  envolotrio.cargarTablas();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        envolotrio.grabarEnArchivoSueldo(2000.0, jugadores);
        ArrayList<Jugador> jugs = envolotrio.leerArchvioSueldos();

        System.out.println(jugs);
        //System.out.println(envolotrio);

/*
        try{
            envolotrio.cantidadElementos("color", "green", 2);
        } catch (sobrePasaCantidadException e) {
            System.out.println(e);
        }


 */



    }

}
