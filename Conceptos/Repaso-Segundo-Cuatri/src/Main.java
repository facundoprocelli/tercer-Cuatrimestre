import java.io.*;
import java.util.ArrayList;

import ENUM.ESexo;
import Module.*;
import JsonUtiles.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws JSONException {

        try {
            grabarArchivoObjetos();
        } catch (IOException e) {
            System.out.println("no se ha podido trabajar con el archvio");
        }

        Lista<Persona> listaPersonas = leerArchvioObjetos();
        System.out.println(listaPersonas);

        //Creo el JA que voy a grabar despues
        JSONArray JA = new JSONArray();
        for (int i = 0; i < listaPersonas.tamano(); i++) {

            //Agarro la persona actual de la lista
            Persona P = listaPersonas.agarrar(i);

            //Creo un JO para guardar los datos de la persona
            JSONObject jo = new JSONObject();
            jo.put("nombre", P.getNombre());
            jo.put("edad", P.getEdad());
            jo.put("genero", P.getGenero());

            //Guardo el objeto en el arreglo
            JA.put(jo);
        }

        JsonUtiles.grabar(JA);
        System.out.println(JA);
        listaPersonas.vaciarLista();

        //Creo un JA con los datos del archivo cargado
        JSONArray ja = new JSONArray(JsonUtiles.leer("test"));
        for (int i = 0; i < ja.length(); i++) {

            //Agarro el  objeto actual  del JSON
            JSONObject jo = ja.getJSONObject(i);

            //Creo una persona con los datos del JO
            Persona p = new Persona(jo.getString("nombre"),
                    jo.getInt("edad"),
                    ESexo.valueOf(jo.getString("genero")));

            //Guardo a la persona en la lista
            listaPersonas.enlistar(p);
        }

        System.out.println(listaPersonas);
    }

    static void grabarArchivoObjetos() throws IOException {

        //Creo un OOS para poder escribir  objetos en el archivo
        ObjectOutputStream objectOutputStream = null;

        try {
            //Creo un FOP para poder escribir los datos del archivo personas.bin
            // "abro" el archivo
            FileOutputStream fileOutputStream = new FileOutputStream("personas.bin");
            //Le doy un valor de FOS al OOS para poder escribir los datos en ese archivo.
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(new Persona("Facu", 19, ESexo.MASCULINO));
            objectOutputStream.writeObject(new Persona("Nico", 21, ESexo.OTRO));
            objectOutputStream.writeObject(new Persona("Cami", 19, ESexo.FEMENINO));

        } catch (IOException e) {
            throw e;
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw e;
            }
        }
    }

    //Funcion que devuelve una lista de obbjetos
    static <E extends Serializable> Lista<E> leerArchvioObjetos() {

        //creo el OIS para poder leer datos del archivo
        ObjectInputStream objectInputStream = null;
        Lista<E> lista = new Lista<E>();

        try {
            //Accedo al archiov.bin
            FileInputStream fileInputStream = new FileInputStream("Personas.bin");
            //inicializao el OIS con el FIS
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                //Mientras haya elementos, caseto el objeto y lo enlisto
                E e = (E) objectInputStream.readObject();
                lista.enlistar(e);
            }

        } catch (EOFException e) {
            System.out.println("Termino el archivo");
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
        return lista;
    }
}