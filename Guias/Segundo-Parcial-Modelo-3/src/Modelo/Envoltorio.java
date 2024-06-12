package Modelo;

import Exceptions.sobrePasaCantiadException;
import json.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Envoltorio {

    public Envoltorio() {
    }

    public ArrayList<Aeropuerto> cargarAeropuertos() {

        ArrayList<String> a = new ArrayList<>();
        a.add("Bueno");
        a.add("Bonito");
        a.add("Car0");

        Aeropuerto aeropuerto = new Aeropuerto("Ministro Pistarini", "Ezeiza", 300, new Tag(a));
        Aeropuerto aeropuerto2 = new Aeropuerto("Astor Piazola", "Mar del Plata", 20,new Tag(a));
        Aeropuerto aeropuerto3 = new Aeropuerto("Jorge Newery", "CABA", 200,new Tag(a ));

        ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
        aeropuertos.add(aeropuerto);
        aeropuertos.add(aeropuerto2);
        aeropuertos.add(aeropuerto3);

        return aeropuertos;
    }

    //JAVA to JSON
    public void pasarAeropuertosAJSON(){
        //Agarro todos los aeropuertos que tengo;
        ArrayList<Aeropuerto> aeropuertos = cargarAeropuertos();

        //creo el JA que voy a escribir
        JSONArray jsonArray = new JSONArray();
        for(int i = 0; i < aeropuertos.size(); i++){
            try {
                //Agarro el aeropuerto actual
                Aeropuerto aeropuertoActual = aeropuertos.get(i);

                //Creo y escribo el JA tags que voy a agregar mas tarde al JO
                JSONArray tag = new JSONArray();
                ArrayList<String> stringTags = aeropuertoActual.getTags().getTags();
                for(int k = 0; k < stringTags.size(); k++){
                    tag.put(stringTags.get(k));
                }

                //Creo el JO y agrego todas los datos necesarios, incluso el JA creado mas arriba
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("nombre", aeropuertoActual.getNombre());
                jsonObject.put("ubicacion", aeropuertoActual.getUbicacion());
                jsonObject.put("capacidad", aeropuertoActual.getCapacidad());
                jsonObject.put("tags", tag);

                jsonArray.put(jsonObject);
            }catch (JSONException e){
                System.out.println("Excepcion del JSON");
            }
        }

        //Grabo tod en el JSON
        JsonUtiles.grabar(jsonArray);

    }


    public ArrayList<Aeropuerto> pasarAeropuertosXCapacidad(int capacidad)  {
        ArrayList<Aeropuerto> aeropuertos = cargarAeropuertos();
        ArrayList<Aeropuerto> aeropuertosSuperiores = new ArrayList<>();

        for(Aeropuerto aeropuerto : aeropuertos){

            if(aeropuerto.getCapacidad() > capacidad){
                aeropuertosSuperiores.add(aeropuerto);
            }else{
                System.out.println(new sobrePasaCantiadException(aeropuerto.getCapacidad()));
            }
        }

        return aeropuertosSuperiores;
    }


    public ListaGenerica<Piloto> guardarPilotos(){

        ListaGenerica<Piloto> pilotos = new ListaGenerica<>();
        ArrayList<String> tags = new ArrayList<>();
        tags.add("Bueno");
        tags.add("capo");
        tags.add("master");

        ArrayList<String> tags2 = new ArrayList<>();
        tags2.add("Capo");
        tags2.add("Genio");
        tags2.add("Crack");

        Piloto p =new Piloto("Facundo", "Procelli", 1, 340, new Tag(tags));
        Piloto p1 =new Piloto("Nicolas", "Procelli", 2, 234, new Tag(tags2));

        pilotos.agregar(p);
        pilotos.agregar(p1);

        return pilotos;
    }


    public HashSet<Tag> pasarTagsAHashSet(ListaGenerica<Piloto> pilotoListaGenerica){

        HashSet<Tag> tags = new HashSet<>();


        for(int i = 0; i < 2; i++){
            Tag tag = pilotoListaGenerica.getLista().get(i).getTags();

            tags.add(tag);
        }
        return tags;
    }

}
