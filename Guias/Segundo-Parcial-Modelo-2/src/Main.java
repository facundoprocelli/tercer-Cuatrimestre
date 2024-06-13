import Modelo.*;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        Gestora gestora = new Gestora();

        try {
            ListaGenerica<Persona> p = gestora.JsonAJava();
            System.out.println(p);

            ListaGenerica<Persona> pMayores = gestora.listaMayores(p);
            System.out.println("\n" + pMayores);

            HashSet<Amigo> amigos = gestora.listaDeAmigos(p);
            System.out.println(amigos);

            HashMap<String, ArrayList<String>> etiquetas = gestora.mapaDeTags(p);
            System.out.println(etiquetas);

            int cantidadEtiquetasXTamano = gestora.cantidadDeEtiquetas("649233e6bc7f30d793e9c73c", 5, p);
            System.out.println(cantidadEtiquetasXTamano);

            gestora.grabarArchivoXSaldo(3000.0,p);

            ArrayList<Persona> listaSueldos = gestora.leerArchivoSueldo();
            System.out.println(listaSueldos);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}